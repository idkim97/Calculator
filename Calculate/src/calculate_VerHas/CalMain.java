package calculate_VerHas;

import java.util.Scanner;
import java.util.StringTokenizer;

import lombok.Data;

@Data
public class CalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CalResult res = new CalResult();
		Calculator cal = new Calculator();
		HasCal hcal = new HasCal();

		int a;
		int b;
		String op;

		while (true) {
			String str;
			str = sc.nextLine();

			StringTokenizer st = new StringTokenizer(str, "\\+|\\-|\\*|\\/", true);

			String temp = st.nextToken();
			if (temp.equals("=")) {
				res.result();
				break;
			}

			// 첫번째 문자가 숫자인지 기호인지를 판단하는 코드
			// 숫자면 true, 기호면 false
			boolean IntOrNot = temp.matches("-?\\d+");

			// StringBuffer가 비어있는 경우
			if (hcal.getStringBuffer().isEmpty()) {
				if (cal.judgeCal(IntOrNot)) {
					// a는 int형식으로 저장
					a = Integer.parseInt(temp);
					cal.setA(a);
					System.out.println("초기 a : " + cal.getA());

					// StringBuffer에 String형식으로 저장
					
					hcal.setStringBuffer(hcal.getStringBuffer()+temp);
					System.out.println("초기 StringBuffer : " + hcal.getStringBuffer());

					cal.setSum(cal.getSum()+a);
					System.out.println("초기 sum : " + cal.getSum());
					hcal.setResult(hcal.getResult()+a);
					System.out.println("초기 Result : " + hcal.getResult());
				} else {
					System.out.println("숫자를 입력하세요!");
					continue;
				}
			}

			// StringBuffer가 비어있지 않은 경우
			else {
				// 첫번째 문자가 숫자일경우 그대로 연산 진행
				// 숫자인경우(int)
				if (cal.judgeCal(IntOrNot)) {
					a = Integer.parseInt(temp);
					// a는 int형식으로 저장
					cal.setA(a);

					// StringBuffer에 String형식으로 저장
					hcal.setStringBuffer(hcal.getStringBuffer()+temp);
					System.out.println("중간 StringBuffer : " + hcal.getStringBuffer());
					
					
					// 원래는 cal.calculate()에서 자체적으로 hcal.setResult를 해줬는데
					// 이랬더니 cal에서는 hcal.getResult했을때 값이 제대로 나오는데
					// main에서는 hcal.getResult했을때 값이 안나와버림
					// 그래서 calculate에서는 sum만 값을 구해주고 main에서 hcal.setResult를 해줌
					// 그랬더니 main에서 값이 제대로 나옴
					cal.calculate();
					hcal.setResult(cal.getSum());

					
					System.out.println("중간 Result : " + hcal.getResult());
					
				}

				// 첫번째 문자가 기호일 경우
				else if (!cal.judgeCal(IntOrNot)) {
					String judgedOp = String.valueOf(cal.judgeOp(temp));
					// judgedOp를 상위생성자에 넣어서 보내준다.
					cal.setOp(judgedOp);
					System.out.println("설정 op : " + cal.getOp());
					// judgedOp를 Is_A_Cal의 StringBuffer에 넣어준다.
					hcal.setStringBuffer(hcal.getStringBuffer()+judgedOp);
				}
			}
		}
	}
}

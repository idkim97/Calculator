package calculate_Ver_Adapter;

import java.util.Scanner;
import java.util.StringTokenizer;

import lombok.Data;

@Data
public class ContinuousCal extends CalAbstract {

	Scanner sc = new Scanner(System.in);
	CalAdapter calAdapter = new CalAdapter();
	

	// 연속 계산 수행
	// 추상메소드 구현부
	@Override
	public void cal(String temp) {

		/*
		 * String str; str = sc.nextLine();
		 * 
		 * StringTokenizer st = new StringTokenizer(str, "\\+|\\-|\\*|\\/", true);
		 * 
		 * String temp = st.nextToken();
		 */

		if (temp.equals("=")) {
			/////////// 얘를 res.result()로 하면 왜안됨???
			// res.result();
			System.out.println("연산과정 : " + getSb().toString());
			System.out.println("결과 : " + getResult());

			calAdapter.Display(getSb(), getResult());

			getSb().setLength(0);
			setResult(0);
			setSum(0);
			System.exit(0);
			
		}

		// 첫번째 문자가 숫자인지 기호인지를 판단하는 코드
		// 숫자면 true, 기호면 false
		boolean IntOrNot = judgeNumOrOp(temp);

		// StringBuffer가 비어있는 경우
		if (getSb().isEmpty()) {
			if (judgeCal(IntOrNot)) {
				int a = Integer.parseInt(temp);
				// a는 int형식으로 저장
				setA(a);
				System.out.println("a : " + getA());

				// StringBuffer에 String형식으로 저장
				getSb().append(temp);
				setSum(getSum() + a);
				System.out.println("sum : " + getSum());
				setResult(getResult() + a);
				System.out.println("Result : " + getResult());
			} else {
				System.out.println("숫자를 입력하세요!");
				
			}
		}

		// StringBuffer가 비어있지 않은 경우
		else {
			// 첫번째 문자가 숫자일경우 그대로 연산 진행
			// 숫자인경우(int)
			if (judgeCal(IntOrNot)) {
				int a = Integer.parseInt(temp);
				// a는 int형식으로 저장
				setA(a);
				System.out.println("a : " + getA());
				// StringBuffer에 String형식으로 저장
				getSb().append(temp);
				calculate();
				System.out.println("sum : " + getSum());
				System.out.println("Result : " + getResult());
			}

			// 첫번째 문자가 기호일 경우
			else if (!judgeCal(IntOrNot)) {
				String judgedOp = String.valueOf(judgeOp(temp));
				// judgedOp를 상위생성자에 넣어서 보내준다.
				setOp(judgedOp);

				// judgedOp를 Is_A_Cal의 StringBuffer에 넣어준다.
				getSb().append(judgedOp);
			}
		}

	}

}

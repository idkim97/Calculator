package calculate_Ver2;


import java.util.Scanner;
import java.util.StringTokenizer;

public class CalMain {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalResult res = new CalResult();
		Cal cal = new Cal();

		int a;
		int b;
		String op;

		while (true) {
			String str;
			str = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(str,"\\+|\\-|\\*|\\/",true);
			
			String temp = st.nextToken();
			
			// 첫번째 문자가 숫자인지 기호인지를 판단하는 코드
			boolean IntOrNot = temp.matches("-?\\d+");
			
			// 첫번째 문자가 숫자일경우 그대로 연산 진행
			// 숫자인경우(int)
			if(cal.judgeCal(IntOrNot)) {
				a = Integer.parseInt(temp);
				if(a==0) break;
				op = st.nextToken();
				b = Integer.parseInt(st.nextToken());
				// 결과는 CalResult에서 따로 처리
				res.result(a,b,op);
				continue;
			}
			
			
			// 첫번째 문자가 기호일 경우
			else if (!cal.judgeCal(IntOrNot)) {
				String judgedOp = String.valueOf(cal.judgeOp(temp));
				res.result(judgedOp, (int) res.res1, Integer.parseInt(st.nextToken()));
				continue;
			}
		}
	}
}

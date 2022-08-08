package calculate;

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
			
			if(temp.equals("+") || temp.equals("-")|| temp.equals("*")|| temp.equals("/")) {
				res.result2(temp, (int)res.res1,Integer.parseInt(st.nextToken()));
				continue;
			}
			
			a = Integer.parseInt(temp);
			if(a==0) break;
			
			op = st.nextToken();
			b = Integer.parseInt(st.nextToken());
			
			
			// 결과는 CalResult에서 따로 처리
			res.result(a,b,op);
			
		}
	}
}

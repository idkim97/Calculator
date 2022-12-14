package calculate_Ver3;

import lombok.Data;

@Data
public class Calculator {
	
	
	public int a;
	public int b;
	public String op;
	public int result;
	public int sum;

	
	
	// 더하기 연산 수행후 결과 return
	public void add() {
		result = a + b;
		sum = result;
	}

	// 빼기 연산 수행 후 결과 return
	public void sub() {
		result = a - b;
		sum = result;
	}

	// 곱하기 연산 수행 후 결과 return
	public void mul() {
		result = a * b;
		sum = result;
	}

	// 나누기 연산 수행 후 결과 return
	public void div() {
		result = a / b;
		sum = result;
	}

	public void calculate(boolean flag) {
		if (flag == true) {
			if (op.equals("+")) {
				add();
			} else if (op.equals("-")) {
				sub();
			} else if (op.equals("*")) {
				mul();
			} else if (op.equals("/")) {
				div();
			}
		} else {
			if (op.equals("+")) {
				result = sum + b;
				sum = result;
			} else if (op.equals("-")) {
				result = sum - b;
				sum = result;
			} else if (op.equals("*")) {
				result = sum * b;
				sum = result;
			} else if (op.equals("/")) {
				result = sum / b;
				sum = result;
			}
		}
	}


	// 연산기호가 무엇인지 판단하는 객체
	public char judgeOp(String op) {
		if (op.equals("+")) {
			return op.charAt(0);
		} else if (op.equals("-")) {
			return op.charAt(0);
		} else if (op.equals("*")) {
			return op.charAt(0);
		} else if (op.equals("/")) {
			return op.charAt(0);
		}
		return 'X';
	}

	// 입력받은게 숫자인지 기호인지 판단하는 객체
	public boolean judgeCal(boolean temp) {
		if (temp == true)
			return true;
		else
			return false;
	}

}

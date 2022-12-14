package calculate_Ver_Interface;

import lombok.Data;

@Data
public abstract class CalAbstract {
	
	private int a;
	private int b;
	private String op;
	private double sum=0;
	
	private StringBuffer sb = new StringBuffer();
	private double result=0;
	
	
	private CalResult calResult;
	
	
	// 추상클래스 내에 클래스를 하나 만들어서 인터페이스를 implements해줌으로써 
	// calResult를 초기화할 수 있음.
	// 이게 어댑터 패턴(클래스)이네.. 
	class DefaultCalResultDisplay implements CalResult{
		
		@Override
		public void PrintResult() {
			System.out.println("결과 : " + getResult());
		}
		
		@Override
		public void PrintProcess() {
			System.out.println("연산 과정 : " + getSb());
		}
	}
	

	public void add() {
		setSum(getSum()+getA());
		setResult(getSum());
	}
	public void sub() {
		setSum(getSum()-getA());
		setResult(getSum());
	}
	public void mul() {
		setSum(getSum()*getA());
		setResult(getSum());
	}
	public void div() {
		setSum(getSum()/getA());
		setResult(getSum());
	}
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
	
	// 실제 계산 수행
	public void calculate() {
		if (getOp().equals("+")) {
			add();
		} else if (getOp().equals("-")) {
			sub();
		} else if (getOp().equals("*")) {
			mul();
		} else if (getOp().equals("/")) {
			div();
		}
	}

	// 입력받은게 숫자인지 기호인지 판단하는 객체
	public boolean judgeCal(boolean temp) {
		if (temp == true)
			return true;
		else
			return false;
	}

	// 숫자면 true, 기호면 false return
	public boolean judgeNumOrOp(String temp) {
		return temp.matches("-?\\d+");
	}

	
	// 추상메소드
	public abstract void cal();
	

	
	public void addDisplayResult(CalResult calResult) {
		this.calResult = calResult;
	}
	
	public void display() {
		if(this.calResult == null) {
			DefaultCalResultDisplay defaultCalResultDisplay = new DefaultCalResultDisplay();
			defaultCalResultDisplay.PrintProcess();
			defaultCalResultDisplay.PrintResult();
		}
		else {
			calResult.PrintProcess();
			calResult.PrintResult();
		}
	}

}

package calculate_VerHas;

import lombok.Data;

@Data
public class CalResult{
	
	HasCal hcal = new HasCal();
	Calculator cal = new Calculator();
	
	// 연산을 한번만 진행하는 객체
	public void result() {
		//System.out.printf("결과 : " + hcal.result + "\n");
		//System.out.printf("연산과정 : " + super.StringBuffer + "\n");
	}
	
	
}




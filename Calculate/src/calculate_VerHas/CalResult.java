package calculate_VerHas;

import lombok.Data;

@Data
public class CalResult{
	
	HasCal hcal = new HasCal();
	
	// 연산을 한번만 진행하는 객체
	public void result() {
		System.out.println("결과 : " + hcal.getResult());
		System.out.println("연산과정 : " + hcal.getStringBuffer());
	}
}




package calculate_VerIs;

import lombok.Data;

@Data
public class CalResult extends IsCal{
	
	
	// 연산을 한번만 진행하는 객체
	public void result() {
		System.out.printf("결과 : " + super.result + "\n");
		System.out.printf("연산과정 : " + super.StringBuffer + "\n");
	}
}




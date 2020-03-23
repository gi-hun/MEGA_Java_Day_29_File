package day_29;

public class Ex {
	public static void main(String[] args) {
		
		// 예외(Exception)처리
		
		int x = 10;
		int y = 0;
		
		//java.lang.ArithmeticException: / by zero 
		if(y != 0) {
			System.out.println(x / y);
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		//---------------------------------------------
		
		try {
			// 에러 발생 여지가 있는 코드
			System.out.println(x / y);
		}catch(Exception e) {
			// try영역에서 에러가 발생하면, 보여줄 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
}

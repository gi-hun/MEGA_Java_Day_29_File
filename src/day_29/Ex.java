package day_29;

public class Ex {
	public static void main(String[] args) {
		
		// ����(Exception)ó��
		
		int x = 10;
		int y = 0;
		
		//java.lang.ArithmeticException: / by zero 
		if(y != 0) {
			System.out.println(x / y);
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		//---------------------------------------------
		
		try {
			// ���� �߻� ������ �ִ� �ڵ�
			System.out.println(x / y);
		}catch(Exception e) {
			// try�������� ������ �߻��ϸ�, ������ �ڵ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
	}
}

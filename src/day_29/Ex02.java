package day_29;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		
		// ���� ����
		try {
			FileWriter fw = new FileWriter("0323.txt");
			fw.write("�޸��� ����");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

package day_29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		
		// ���� �ҷ�����
		
		// 1. File : ������ �������� Ȯ��
		// 2. FileReader : ������ �ҷ�����(�б�)
		// 3. BufferedReader : ���� ���� ���ڿ� �о
		
		File file = new File("0323.txt");
		if(file.exists()) {
			
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String data = br.readLine();			// ������ �� �� �о����
				System.out.println(data);
				
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}

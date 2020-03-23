package day_29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		
		// 파일 불러오기
		
		// 1. File : 파일의 존재유무 확인
		// 2. FileReader : 파일을 불러오기(읽기)
		// 3. BufferedReader : 파일 안의 문자열 읽어괴
		
		File file = new File("0323.txt");
		if(file.exists()) {
			
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String data = br.readLine();			// 데이터 한 줄 읽어오기
				System.out.println(data);
				
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}

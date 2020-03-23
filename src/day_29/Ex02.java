package day_29;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		
		// 파일 쓰기
		try {
			FileWriter fw = new FileWriter("0323.txt");
			fw.write("메모장 쓰기");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

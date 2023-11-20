package chap2_4;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		
		try {
			int keycode = System.in.read();
			System.out.println(keycode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if(10<100) {
//			int a= 100;
//		}
//		System.out.println(a);   a의 오류
	}

}

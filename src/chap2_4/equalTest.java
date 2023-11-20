package chap2_4;

public class equalTest {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 100;
		
		// num1이 100과 같은지 if문으로 작성
		if(num1 == num2) {
			System.out.println("num1은 100입니다.");
			System.out.println("num2은 100입니다.");
			
		}
		
		
		String str1 = "Korea";  // String 클래스, str1은 객체이다.
		String str2 = new String("Korea");
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		if(str1.equals(str2)) {     // 문자열은 .equals() 라는 메서드를 사용 (문자열의 내용만 비교)
			System.out.println("equals비교 : str1과 str2은 Korea입니다..");
		}
		if(str1==str2) {     // == 연산자는 메모리 주소를 비교
			System.out.println("==비교 : str1과 str2은 Korea입니다.");
		
		}
	}

}

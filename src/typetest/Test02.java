package typetest;

public class Test02 {

	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "123.123"; // 소수점이 들어간 문자열은 정수로 변환 불가
		int itg = Integer.parseInt(str1);  // 문자열을 정수로 변환
		
		double dbl = Double.parseDouble(str2); // 문자열을 실수로 변환
		
		System.out.println(itg);
		System.out.println(dbl);
		
		int i1 = 1234;
		
		String str3 = String.valueOf(i1); // 정수 또는 실수를 문자열로 변환
		
		System.out.println(str3);
		
		
	}

}

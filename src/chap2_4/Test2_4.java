package chap2_4;

public class Test2_4 {
	public static void main(String[] args) {
		
		int a = 100;
		
		System.out.println("println은 다음 출력내용을 다음줄로 출력");
		System.out.println("println");
		
		System.out.print("print는 다음 출력내용이 연결되어(다음줄로 가지 않음)출력");
		System.out.print("print\n");
		
		System.out.printf("나의 나이는 %d 입니다.\n", 30); // %d 정수, %f 실수, %s 문자열
		System.out.printf("나의 나이는 %s 입니다.\n", "서른살"); // %d 정수, %f 실수, %s 문자열
		
		System.out.printf("나의 수학점수는 %d 입니다.\n", a);
		
		System.out.println("나의 수학점수는 "+a+"점 입니다.");
		
	}

}

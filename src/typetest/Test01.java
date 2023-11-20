package typetest;

public class Test01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		double result;
		
		result = (double)a / b; // 정수와 정수의 나눗셈에서 실수연산 결과를 얻으려면 두 정수 중의 하나이상은 반드시 실수여야함
		// 10 / 3.0 or 10.0 / 3
		System.out.println(result);
		
	}
}

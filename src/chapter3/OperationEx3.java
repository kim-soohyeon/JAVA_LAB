package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		//단락 회로 평가(Short-Circuit Evaluation)
		int num1 = 10;
		int i = 2;
		
//		boolean value = (((num1 = num1 + 10) < 10) && ((i = i + 2) > 10));
//		System.out.println(value);
//		System.out.println(num1);
//		System.out.println(i);
		
		boolean value = (((num1 = num1 + 10) < 10) || ((i = i + 2) > 10));
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}

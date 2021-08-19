package chapter3;

public class OpertaionEx4 {

	public static void main(String[] args) {
		//복합 대입 연산자
		int num1 = 10;
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		num1 -= 1;
		System.out.println(num1);
		
		//조건 연산자 - > 삼항 연산자
		int num = (5 > 3)? 10: 20;
		System.out.println(num);
	}

}

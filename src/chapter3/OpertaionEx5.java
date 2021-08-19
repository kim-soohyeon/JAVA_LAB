package chapter3;

public class OpertaionEx5 {

	public static void main(String[] args) {
		//비트 연산자
		int num1 = 5; //00000101
		int num2 = 10;//00001010
		
		//&(AND)연산자: 두 비트가 모두 1인 경우만 1, 아니면 0
		int result = num1 & num2;//00000000
		System.out.println(result);
		
		//|(OR)연산자: 두 비트가 모두 0인 경우만 0, 아니면 1
		int result2 = num1 | num2;//00001111
		System.out.println(result2);
		
		//^(XOR)연산자: 두 비트가 다른 값이면 1, 같은 값이면 0
		//~(반전)연산자: 비트 값을 0은 1로 1은 0으로 바꾸는 연산자
		
		//<<(왼쪽shift): 비트를 왼쪽으로 이동하는 연산자
		int num3 = 5;//00000101
		System.out.println(num3 << 1); //<<1은 *2(2의 1승)한 결과와 같다.
		System.out.println(num3);
		System.out.println(num3 << 2); //<<1은 *2의 2승 결과와 같다.
		System.out.println(num3 << 3); //<<1은 *2의 3승 결과와 같다.
		//>>(오른쪽shift): 비트를 오른쪽으로 이동하는 연산자
		System.out.println(num3 >> 1);//>>1은 /2(2의 1승)한 결과와 같다.
	}

}

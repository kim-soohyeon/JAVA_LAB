package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		//1부터 100까지 홀수만 더하기
		
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if((num % 2) == 0) {//num 값이 짝수인 경우
				continue;		//이후 수행을 생략하고 num++수행
			}
			total += num;
		}
		
		System.out.println(total);
	}

}

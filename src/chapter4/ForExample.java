package chapter4;

public class ForExample {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			sum += num;
		}
		
//		↓ while(true)와 같다.
//		for( ; ; ) {
//			
//		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}

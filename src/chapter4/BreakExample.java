package chapter4;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum > 100) {
				break;
			}
			num++;
		}
		
		System.out.println(num + "까지 더했을 때");
		System.out.println(sum + "이 됩니다.");
	}

}

package chapter4;

public class NestedLoopExample {

	public static void main(String[] args) {
		//짝수단의 구구단 출력하기
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			if( (dan % 2) != 0) {
				continue;
			}
			for(times = 1; times <= 9; times++) {
				if(times > dan) break;
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
		
	}

}

package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1:
				medalColor = 'G';
				break;	//break문이 없다면, 다음 break를 만날 때까지 수행된다.
			case 2:
				medalColor = 'S';
				break;
			case 3:
				medalColor = 'B';
				break;
			default:
				medalColor = 'A';
		}
		
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
	}

}

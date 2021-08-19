package chapter2;

public class explicitConversion {

	public static void main(String[] args) {
		//명시적 형 변환
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; //3 + 0
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}

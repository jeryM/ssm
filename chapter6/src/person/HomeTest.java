package person;

import java.util.Scanner;

public class HomeTest {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Home mony=new Home();
		Scanner input=new Scanner(System.in);
		do{
		System.out.print("����������");
		mony.money=input.nextInt();
		System.out.println("��ѡ��������ޣ�1.3�꣨36���£� 2.5�꣨60���£�3.20�꣨240���£�");
		int years=input.nextInt();
		switch (years){
		case 1:
			double a=mony.way1(mony.money);
			System.out.println("�¹�Ϊ"+a);
			break;
		case 2:
			mony.way2(mony.money);
			break;
		case 3:
			double c=mony.way3(mony.money);
			System.out.println("�¹�Ϊ"+c);
			break;
		}
		if(years>3){
			System.out.println("�������");
		}
	 System.out.println("���������𣿣�y/n��"+"�����룺");
		}while(input.next().equals("y"));
		// TODO Auto-generated method
	}


}

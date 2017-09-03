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
		System.out.print("请输入贷款金额：");
		mony.money=input.nextInt();
		System.out.println("请选择贷款年限：1.3年（36个月） 2.5年（60个月）3.20年（240个月）");
		int years=input.nextInt();
		switch (years){
		case 1:
			double a=mony.way1(mony.money);
			System.out.println("月供为"+a);
			break;
		case 2:
			mony.way2(mony.money);
			break;
		case 3:
			double c=mony.way3(mony.money);
			System.out.println("月供为"+c);
			break;
		}
		if(years>3){
			System.out.println("输入错误！");
		}
	 System.out.println("继续操作吗？（y/n）"+"请输入：");
		}while(input.next().equals("y"));
		// TODO Auto-generated method
	}


}

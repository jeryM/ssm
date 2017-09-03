package work;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 guest=new Person1("韩冰");//选择Person的带参构造方法创建对象
		int a;
		do{
		System.out.println("大家好，欢迎'"+"guest.name"+"'来到地球");
		System.out.print("请选择您的性别：（1、男 2、女）");
		Scanner input=new Scanner(System.in);
		switch(input.nextInt()){
			case 1:
				guest.gender="男";    //为对象的性别赋值
				break;
			case 2: 
				guest.gender="女";   //为对象的性别赋值
				break;
				default:
					System.out.println("操作错误");
					return;
		}
		System.out.print("请输入您的年龄：");
		guest.age=input.nextInt();    //为对象的年龄赋值
		guest.work();               //调用无参work()方法
		System.out.print("请重新输入您的工作理念：");
		String contect=input.next();
		guest.work(contect);         //调用有参work()方法
		System.out.println("********************");
		System.out.println("是否继续（1/0）：");
		 a=input.nextInt();
		}
		
		while(a==1);

	}

}

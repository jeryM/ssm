package work;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 guest=new Person1("����");//ѡ��Person�Ĵ��ι��췽����������
		int a;
		do{
		System.out.println("��Һã���ӭ'"+"guest.name"+"'��������");
		System.out.print("��ѡ�������Ա𣺣�1���� 2��Ů��");
		Scanner input=new Scanner(System.in);
		switch(input.nextInt()){
			case 1:
				guest.gender="��";    //Ϊ������Ա�ֵ
				break;
			case 2: 
				guest.gender="Ů";   //Ϊ������Ա�ֵ
				break;
				default:
					System.out.println("��������");
					return;
		}
		System.out.print("�������������䣺");
		guest.age=input.nextInt();    //Ϊ��������丳ֵ
		guest.work();               //�����޲�work()����
		System.out.print("�������������Ĺ������");
		String contect=input.next();
		guest.work(contect);         //�����в�work()����
		System.out.println("********************");
		System.out.println("�Ƿ������1/0����");
		 a=input.nextInt();
		}
		
		while(a==1);

	}

}

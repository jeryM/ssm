package work;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=11;
		int num2=num1;
		System.out.println("num1���ڣ�"+num1);
		num2=22;
		System.out.println("��num1����num2���޸�num2��ֵ��"+"num1���ڣ�"+num1);
		System.out.println("*******************"+"*****************");
		//������������
		Person person1=new Person();
		person1.age=11;
		Person person2=person1;
		System.out.println("stu1.age���ڣ�"+person1.age);
		person2.age=22;
		System.out.println("��stu1���󸳸�stu2������޸�stu2��age���ԣ�"+"stu1.age����:"+person1.age);
		System.out.println("********************"+"*****************");

	}

}

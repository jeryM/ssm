package work;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=11;
		int num2=num1;
		System.out.println("num1等于；"+num1);
		num2=22;
		System.out.println("把num1赋给num2后，修改num2的值，"+"num1等于："+num1);
		System.out.println("*******************"+"*****************");
		//引用数据类型
		Person person1=new Person();
		person1.age=11;
		Person person2=person1;
		System.out.println("stu1.age等于："+person1.age);
		person2.age=22;
		System.out.println("把stu1对象赋给stu2对象后，修改stu2的age属性，"+"stu1.age等于:"+person1.age);
		System.out.println("********************"+"*****************");

	}

}

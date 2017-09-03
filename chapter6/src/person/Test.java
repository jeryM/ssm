package person;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //对象数组
		Person[] person={new Person (21,"韩冰"),new Person(23,"牛顿"),new Person(24,"马达")};
		for(int i=0;i<person.length;i++){
			System.out.println("age属性等于"+person[i].age+","+"name属性等于"+person[i].name);
		/* Person per1=new Person();
		 * Person per2=new Person();
		 * Person per3=new Person();
		 * 
		 * 
		 * 
		 * */
		}
	}

	

}

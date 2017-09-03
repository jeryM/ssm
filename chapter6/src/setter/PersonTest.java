package setter;

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hanbing=new Person();
		hanbing.setName("韩冰");
		hanbing.setAge(221);
		hanbing.setGender("中性");
		hanbing.say();
		//String a=hanbing.getName();	
		//调用方法
		System.out.println(hanbing.getName());
		System.out.println(hanbing.getAge());

	}

}

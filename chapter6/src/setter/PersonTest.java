package setter;

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hanbing=new Person();
		hanbing.setName("����");
		hanbing.setAge(221);
		hanbing.setGender("����");
		hanbing.say();
		//String a=hanbing.getName();	
		//���÷���
		System.out.println(hanbing.getName());
		System.out.println(hanbing.getAge());

	}

}

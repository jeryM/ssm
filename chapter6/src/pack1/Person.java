package pack1;

public class Person {
	private String name;
	private String gender;
	private int age;
	//���������ҽ���
	public void say(){
		System.out.println("���ҽ���һ��\r\n������"+this.name+"\r\n�Ա�:"
				+this.gender+"\r\n���䣺"+this.age+"��");
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

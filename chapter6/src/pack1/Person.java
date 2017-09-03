package pack1;

public class Person {
	private String name;
	private String gender;
	private int age;
	//方法：自我介绍
	public void say(){
		System.out.println("自我介绍一下\r\n姓名："+this.name+"\r\n性别:"
				+this.gender+"\r\n年龄："+this.age+"岁");
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

package pack1;

public class Person1 {
	public String name;
	public String gender;
	public static int age;
	public static int PERSON_LIVE;
	public void say(){
		System.out.println("自我介绍一下\r\n姓名："+this.name+"\r\n性别:"
				+this.gender+"\r\n年龄："+this.age+"岁"+PERSON_LIVE);
	}

	/**
	 * @param args
	 */
/*	public String name;
	public String sex;
	public int health;
	public int love;
	
	public Person1(String name,String sex){
		// TODO Auto-generated method stub
		this.name=name;
		this.sex=sex;
		

	}
	public Person1(String name,int health,int love,String sex){
		this(name, sex);//this只能在构造方法中使用，且必须是构造方法第一条语句
		this.health=health;
		this.love=love;
	}*/

}

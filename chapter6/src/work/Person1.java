package work;

public class Person1 {	
	public String name;
	public String gender;
	public int age;
	public Person1(){    //无参构造方法
		this.name="韩冰";
	}
	public Person1(String name){  //带参构造方法
		this.name=name;	
	}
	public void work(){
		System.out.println(this.name+"的工作理念：干活挣钱有饭吃");
	}
	public void work(String contect){
	int age=this.age;
	System.out.println(this.name+age+"岁的工作理念：干活挣钱有饭吃");
	System.out.println(this.name+age+"岁的工作理念："+contect);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package work;

public class Person1 {	
	public String name;
	public String gender;
	public int age;
	public Person1(){    //�޲ι��췽��
		this.name="����";
	}
	public Person1(String name){  //���ι��췽��
		this.name=name;	
	}
	public void work(){
		System.out.println(this.name+"�Ĺ�������ɻ���Ǯ�з���");
	}
	public void work(String contect){
	int age=this.age;
	System.out.println(this.name+age+"��Ĺ�������ɻ���Ǯ�з���");
	System.out.println(this.name+age+"��Ĺ������"+contect);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

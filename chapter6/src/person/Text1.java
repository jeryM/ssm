package person;

public class Text1 {
	public static void main(String[] args){
		/*Student[] stu=new Student[2]; //对象里有对象就要接着创建对象
		Student stu1=new Student();
		Student stu2=new Student();
		stu[0]=stu1;
		stu[1]=stu2;
		stu[0].name="张三";
		stu[0].age=17;
		stu[1].name="里斯";
		stu[1].age=18;
		stu[0].print(stu);//可以用this?******调用方法要用具体的对象******
        stu[0].Student();
		stu[1].Student(3);*/
	
	Student s1=new Student();
	s1.setAge(10);
	int age=s1.getAge();
	System.out.println(age);
	
	Student s2=new Student();
	s2.setName("韩冰");
	String name=s2.getName();
	System.out.println("姓名为："+name);
	
	
	

	/**
	 * @param args
	 */
	
	}
}

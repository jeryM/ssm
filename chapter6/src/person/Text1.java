package person;

public class Text1 {
	public static void main(String[] args){
		/*Student[] stu=new Student[2]; //�������ж����Ҫ���Ŵ�������
		Student stu1=new Student();
		Student stu2=new Student();
		stu[0]=stu1;
		stu[1]=stu2;
		stu[0].name="����";
		stu[0].age=17;
		stu[1].name="��˹";
		stu[1].age=18;
		stu[0].print(stu);//������this?******���÷���Ҫ�þ���Ķ���******
        stu[0].Student();
		stu[1].Student(3);*/
	
	Student s1=new Student();
	s1.setAge(10);
	int age=s1.getAge();
	System.out.println(age);
	
	Student s2=new Student();
	s2.setName("����");
	String name=s2.getName();
	System.out.println("����Ϊ��"+name);
	
	
	

	/**
	 * @param args
	 */
	
	}
}

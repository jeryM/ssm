package setter;

public class Person {
	private String name;   //����
	private String gender;  //�Ա�
	private int age;        //����
	
	public  String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getGender(){
		return gender;     
	}
	public void setGender(String gender){
		if(gender.equals("��")||gender.equals("Ů")){
			this.gender=gender;
		}else{
			System.out.println("***�Ա𲻺Ϸ�!***");
		}
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age<0||age>150){
			System.out.println("***���������Ϊ��"+age+",�����䲻�Ϸ��������ã�***");
			return;
		}
		this.age=age;
	}
	
	public Person(){
		this.name="������";
		this.gender="��";
		this.age=18;
	}
	public Person(String name,String gender,int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	  //���������ҽ���
	public void say(){
		System.out.println("���ҽ���һ��\r\n������"+this.name +"\r\n�Ա�"+
	this.gender+"\r\n���䣺" +
				this.age+"��");
	}
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

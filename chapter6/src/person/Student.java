package person;

public class Student {

	/**
	 * @param args
	 */
	//��װ��1.��˽�л�   2.�����������������ݺ�ȡ����
      private int age;
       public void setAge(int age){
    	   if(age>=0){
    		   this.age=age;
    	   }else{
    		   
    		   this.age=0;
    	   }
       }
       public int getAge(){
    	   return this.age; 
       }
       private String name;
       public void setName(String name){
    	   this.name=name;
    	  System.out.println(this.name);
    	   
       }
       public String  getName(){
    	   return this.name;
       }
      
      
	/*String name;*/
	/*public void print(Student[] stu){
		for(int i=0;i<stu.length;i++){
			System.out.println("������"+stu[i].name+","+"����"+stu[i].age);
		}
		}
	//���캯����1�����û�б�д   Ĭ�ϻ����޲ι���
	//2.���һ����д��Ĭ�Ͼͻ���ʧ
	public void Student(){
		System.out.println("���ǹ��캯����");
	}
	//���캯�������ã���������ʱ��ִ��ĳЩ��Ҫ�Ĳ�������ʼ������
	public void Student(int a){
		System.out.println(a);
	}*/
}



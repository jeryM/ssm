package student;

public class Text1 {

public static void main(String[] args) {
		
		//��������
		Demo1 d = new Demo1();
		
		//���÷���
		int a = 18;//��дΪ d.a=18;ǰ������Dome1�ж�������a 
		String name = "����";
		//�����a��name��ʵ�� Ҫ���ݸ�Demo1�е��β�a��b
		int b = d.show1(a,name);
		System.out.println("����ֵΪ��"+b);
		
		int[] scores = {100,80,90,78};
		 int len = d.show2( scores );
		 System.out.println("����ֵΪ��"+len);
		
		 
		 Student s1 = new Student();
		 s1.name = "����";
		 s1.age = 20;
		 
		 Student s = d.show3(s1);//show3��Demo1���еģ���s��Student�࣬Ϊ�οɵ��ã�
		System.out.println("����ֵΪ:"+s.name);    //չʾ�����е�����ֵ
		System.out.println("����ֵΪ:"+s.age);
		
	}
}

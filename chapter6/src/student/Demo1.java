package student;
  
public class Demo1 {
int a;//��Ա����������������Text1��ɵ��ã���d.a)
	
	//show1:  ����: int a String b ,������: ��ӡ������������ ,������a
	public int show1( int a,String b ){
		System.out.println(a+"----"+b);
		return a;
	}

	
	//show2:  ����:int[] as ,������: ѭ���������� ,���������鳤��
	public int show2(int[] as){
		
		for( int i= 0;i<as.length;i++){
			System.out.println(as[i]);
		}
		return as.length;
	}
	
	//show3:  ����:Student s1 ,������: ��ӡ��������������� ,�����ض���
	public Student show3(Student s1){
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		return s1;
	}
	
}

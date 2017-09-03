package student;
  
public class Demo1 {
int a;//成员变量，定义属性则Text1便可调用（如d.a)
	
	//show1:  参数: int a String b ,方法中: 打印两个变量参数 ,并返回a
	public int show1( int a,String b ){
		System.out.println(a+"----"+b);
		return a;
	}

	
	//show2:  参数:int[] as ,方法中: 循环遍历数组 ,并返回数组长度
	public int show2(int[] as){
		
		for( int i= 0;i<as.length;i++){
			System.out.println(as[i]);
		}
		return as.length;
	}
	
	//show3:  参数:Student s1 ,方法中: 打印对象的姓名和年龄 ,并返回对象
	public Student show3(Student s1){
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		return s1;
	}
	
}

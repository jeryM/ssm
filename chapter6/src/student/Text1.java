package student;

public class Text1 {

public static void main(String[] args) {
		
		//创建对象
		Demo1 d = new Demo1();
		
		//调用方法
		int a = 18;//可写为 d.a=18;前提是在Dome1中定义属性a 
		String name = "张三";
		//这里的a和name是实参 要传递给Demo1中的形参a和b
		int b = d.show1(a,name);
		System.out.println("返回值为："+b);
		
		int[] scores = {100,80,90,78};
		 int len = d.show2( scores );
		 System.out.println("返回值为："+len);
		
		 
		 Student s1 = new Student();
		 s1.name = "张三";
		 s1.age = 20;
		 
		 Student s = d.show3(s1);//show3是Demo1类中的，而s是Student类，为何可调用？
		System.out.println("返回值为:"+s.name);    //展示对象中的属性值
		System.out.println("返回值为:"+s.age);
		
	}
}

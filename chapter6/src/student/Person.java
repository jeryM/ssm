package student;

public class Person {
    public   String name;
    public   String gender;
    public   int age;
	/**
	 * @param args
	 */
/*	public static void main(String[] args) {
*/		// TODO Auto-generated method stub

	//this 关键字是对一个对象的默认引用。每个实例方法内部，都有一个this引用变量，指向调用这个方法的对象
    //this.name 指向  对象hanbing?
	/*public String work(){
		System.out.println(this.name+"的工作理念：干活挣钱有饭吃");//这里的name为成员变量与局部变量同名
	//但这里直接用name也行，如下中所示直接用age
		return"实现自身价值和理想";
	
	}
	
	public void work1(){
		System.out.println(this.name+"的年龄是:"+age+"岁");
	}
*/
    //带参数的方法
    //无参数的工作方法
    public void work(){
    	System.out.println(this.name +"的工作理念：干活挣钱有饭吃");
    }
    //带参数的工作方法
    public void work(String contect){
    	System.out.println(this.name+"的工作理念："+contect);
    }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
}

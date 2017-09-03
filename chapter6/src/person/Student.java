package person;

public class Student {

	/**
	 * @param args
	 */
	//封装：1.先私有化   2.再用两个方法存数据和取数据
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
			System.out.println("姓名："+stu[i].name+","+"年龄"+stu[i].age);
		}
		}
	//构造函数：1。如果没有编写   默认会有无参构造
	//2.如果一旦编写，默认就会消失
	public void Student(){
		System.out.println("这是构造函数！");
	}
	//构造函数的作用：构造对象的时候，执行某些必要的参数，初始化动作
	public void Student(int a){
		System.out.println(a);
	}*/
}



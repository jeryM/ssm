package pack2;

import pack1.Person;    //使用Person类时，需要使用import将其导入
//声明包的含义是声明当前类所处的位置
//导入包的含义是声明在当前类中要使用的其他类所处的位置

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hanbing=new Person();
		hanbing.setName("韩冰");
        hanbing.setAge(22);
		hanbing.setGender("女");
		hanbing.say();

	}

}

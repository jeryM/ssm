package pack2;

import pack1.Person;    //ʹ��Person��ʱ����Ҫʹ��import���䵼��
//�������ĺ�����������ǰ��������λ��
//������ĺ����������ڵ�ǰ����Ҫʹ�õ�������������λ��

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hanbing=new Person();
		hanbing.setName("����");
        hanbing.setAge(22);
		hanbing.setGender("Ů");
		hanbing.say();

	}

}

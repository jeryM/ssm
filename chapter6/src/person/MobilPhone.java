package person;

public class MobilPhone {
	public String brand;
	public MobilPhone(){
		this.brand="ŵ����";
	}
	public  MobilPhone(String bra){
		this.brand=bra;
		
	}
	public String buy(){
		return "û������,��һ��"+brand+"���ӵ��ֻ��ɣ�";
		
	}
	public String buy(String reason){
		return reason +",����һ��"+brand+"���ӵ��ֻ��ɣ�";
	}
	
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}

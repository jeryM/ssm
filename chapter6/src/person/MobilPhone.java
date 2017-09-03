package person;

public class MobilPhone {
	public String brand;
	public MobilPhone(){
		this.brand="诺基亚";
	}
	public  MobilPhone(String bra){
		this.brand=bra;
		
	}
	public String buy(){
		return "没发工资,买一个"+brand+"牌子的手机吧！";
		
	}
	public String buy(String reason){
		return reason +",快买一个"+brand+"牌子的手机吧！";
	}
	
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}

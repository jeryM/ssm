package person;

public class Home {
	double money;
	public double way1(double money){
		/*this.money=money;*/
		double lixi;
		
		lixi=money*0.063;
		double MonthMoney=(money+lixi)/36;
		return MonthMoney;	
	}
	public void way2(double money){  //没有返回值
		this.money=money;
		double lixi;
		lixi=money*0.0612;
		double MonthMoney=(money+lixi)/60;
		System.out.println("月供为；"+ MonthMoney);
	}
	public double way3(double money){
		this.money=money;
		double lixi;
		lixi=money*0.0639;
		double MonthMoney=(money+lixi)/240;
		return MonthMoney;
	}

	/**
	 * @param args
	 */
	

}

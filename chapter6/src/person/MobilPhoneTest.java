package person;

public class MobilPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilPhone mp=new MobilPhone();
		mp.brand="苹果";
		String detail=mp.buy("发工资啦");
		System.out.println(detail);
		System.out.println(mp.buy());
		/*String det=mp.MobilPhone("诺基亚");
		System.out.println(det);
		System.out.println();
*/
	}

}

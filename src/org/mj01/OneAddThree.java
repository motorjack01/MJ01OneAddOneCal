package org.mj01;

import org.mj01.side.MitakeSmsEnum;
import org.mj01.util.MitakeWhateverSMSObj;
import org.mj01.util.RunOneAddThreeImpl;

public class OneAddThree {

	public static void main(String[] args) {
		System.out.println(new RunOneAddThreeImpl().run());
		System.out.println(new OneAddThree.MyMitakeWhateverObj().run());
	}
	
	private static class MyMitakeWhateverObj extends MitakeWhateverSMSObj{
		@Override
		public int run() {
			return myRun() + getConnection(MitakeSmsEnum.whatever());
		}
		
		@SuppressWarnings("unused")
		static public int getConnection(MitakeSmsEnum cenum) {
			String cn = cenum.getSign();
			String token = cenum.getToken();
			return cenum.getI();
		}
	}
}

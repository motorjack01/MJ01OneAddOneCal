package org.mj01.side;

/**
 * 連線列舉
 */
public enum MitakeSmsEnum {
	/**
	 * A機房連線1
	 */
	連線1("c1", "ssdfsvcsd", 1)
	, /**
	 * A機房連線2
	 */
	連線2("c2", "2ff2fffwsf", 2)
	, /**
	 * A機房連線3
	 */
	連線3("c3", "h44hdfgdfg", 3)
	, /**
	 * B機房連線4
	 */
	連線4("c4", "dgfg9dfgj3w", 4)
	, /**
	 * B機房連線5
	 */
	連線5("c5", "dfg8w3mndg", 5)
	, /**
	 * B機房連線6
	 */
	連線6("c6", "dfgd0dfgj3ldfjg", 6)
	, /**
	 * C機房連線7
	 */
	連線7("c7", "3kjdlg3lkjsdlfgk3", 7)
	, /**
	 * E機房連線8
	 */
	連線8("c8", "sdfokjxcvm3m", 8)
	, /**
	 * F機房連線9
	 */
	連線9("c9", "sdfokjxcvm3mttttjjjjjsdfslkdj", 9);

	private String sign;
	private String token;
	private int i;

	/**
	 * 連線列舉
	 * @param sign 識別
	 * @param token token
	 * @param i 返回值
	 */
	MitakeSmsEnum(String sign, String token, int i) {
		this.setSign(sign);
		this.setToken(token);
		this.setI(i);
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	/**
	 * 隨機連線
	 * @return MitakeSmsEnum
	 */
	public static MitakeSmsEnum whatever() {
		MitakeSmsEnum[] array = MitakeSmsEnum.values();
		int i = (int) ((Math.random() * 10)% array.length);
		return array[i];
	}
}

package Model;

//주문내역을 저장하는 VO
public class MenuorderVO {
	int m_code;// 주문내역 일련번호
	String m_name;// 행마다 들어갈 선택된 상품명
	int m_price;// 상품의 개별 가격
	int m_amount;// 개별상품의 총량
	int m_allprice;// 개별상품의 총 가격
	String m_hotorice;// 핫/아이스 구분
	String m_takeout;// 테이크아웃 여부

	// DB에서 주문내역 정보를 받아오는 메소드
	public MenuorderVO(int m_code, String m_name, int m_price, int m_amount, int m_allprice, String m_hotorice,
			String m_takeout) {
		super();
		this.m_code = m_code;
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_amount = m_amount;
		this.m_allprice = m_allprice;
		this.m_hotorice = m_hotorice;
		this.m_takeout = m_takeout;
	}

	public MenuorderVO() {
		super();
	}

	// DB에 주문내역을 저장하는 메소드
	public MenuorderVO(String m_name, int m_price, String m_hotorice, String m_takeout) {
		super();
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_hotorice = m_hotorice;
		this.m_takeout = m_takeout;
		m_amount = 1;// 초기 값은 1개
		m_allprice = m_price * m_amount;// 초기 결제금액은 물품값*1개
	}

	public int getM_code() {
		return m_code;
	}

	public void setM_code(int m_code) {
		this.m_code = m_code;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_price() {
		return m_price;
	}

	public void setM_price(int m_price) {
		this.m_price = m_price;
	}

	public int getM_amount() {
		return m_amount;
	}

	public void setM_amount(int m_amount) {
		this.m_amount = m_amount;
	}

	public int getM_allprice() {
		return m_allprice;
	}

	public void setM_allprice(int m_allprice) {
		this.m_allprice = m_allprice;
	}

	public String getM_hotorice() {
		return m_hotorice;
	}

	public void setM_hotorice(String m_hotorice) {
		this.m_hotorice = m_hotorice;
	}

	public String getM_takeout() {
		return m_takeout;
	}

	public void setM_takeout(String m_takeout) {
		this.m_takeout = m_takeout;
	}

}
package Model;

//�ֹ������� �����ϴ� VO
public class MenuorderVO {
	int m_code;// �ֹ����� �Ϸù�ȣ
	String m_name;// �ึ�� �� ���õ� ��ǰ��
	int m_price;// ��ǰ�� ���� ����
	int m_amount;// ������ǰ�� �ѷ�
	int m_allprice;// ������ǰ�� �� ����
	String m_hotorice;// ��/���̽� ����
	String m_takeout;// ����ũ�ƿ� ����

	// DB���� �ֹ����� ������ �޾ƿ��� �޼ҵ�
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

	// DB�� �ֹ������� �����ϴ� �޼ҵ�
	public MenuorderVO(String m_name, int m_price, String m_hotorice, String m_takeout) {
		super();
		this.m_name = m_name;
		this.m_price = m_price;
		this.m_hotorice = m_hotorice;
		this.m_takeout = m_takeout;
		m_amount = 1;// �ʱ� ���� 1��
		m_allprice = m_price * m_amount;// �ʱ� �����ݾ��� ��ǰ��*1��
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
package Model;

//��ǰ���� ����� VO
public class GoodsVO {

	private int g_no;// ��ǰ������ �Ϸù�ȣ
	private String g_name;// ��ǰ��
	private int g_price;// ��ǰ����

	public GoodsVO(String g_name, int g_price) {
		super();
		this.g_name = g_name;
		this.g_price = g_price;
	}

	public GoodsVO(int g_no, String g_name, int g_price) {
		super();
		this.g_no = g_no;
		this.g_name = g_name;
		this.g_price = g_price;
	}

	public GoodsVO() {
		super();
	}

	public int getG_no() {
		return g_no;
	}

	public void setG_no(int g_no) {
		this.g_no = g_no;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public int getG_price() {
		return g_price;
	}

	public void setG_price(int g_price) {
		this.g_price = g_price;
	}

}

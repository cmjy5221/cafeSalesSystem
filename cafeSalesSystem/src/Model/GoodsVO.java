package Model;

//상품정보 저장용 VO
public class GoodsVO {

	private int g_no;// 상품관리용 일련번호
	private String g_name;// 상품명
	private int g_price;// 상품가격

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

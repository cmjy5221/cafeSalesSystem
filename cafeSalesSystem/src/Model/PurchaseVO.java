package Model;

//�Ǹų����� �����ϴ� VO
public class PurchaseVO {

	private int no;// �Ǹų��� �Ϸù�ȣ
	private int c_no;// ������ �� ��ȣ(��ȸ�� ���Žÿ��� ������ ����ȸ���� �Է��� ����Ʈ ����?)
	private String sdate;// �Ǹ��� �ð�
	private int total;// ���� �Ǹų����� �Ǹűݾ��� ��
	private int amount;// ���� �Ǹų����� �Ǹŷ��� ��
	private String way;// �Ǹ� ��� ����/ī��
	private int rmoney;// �� ���� �Ǹž�
	private int cmoney;// �� ī�� �Ǹž�
	private int tmoney;// �� �����

	
	public PurchaseVO(String sdate, int tmoney) {
		super();
		this.sdate = sdate;
		this.tmoney = tmoney;
	}

	public PurchaseVO(int no, int c_no, String sdate, int total, int amount, String way, int rmoney, int cmoney,
			int tmoney) {
		super();
		this.no = no;
		this.c_no = c_no;
		this.sdate = sdate;
		this.total = total;
		this.amount = amount;
		this.way = way;
		this.rmoney = rmoney;
		this.cmoney = cmoney;
		this.tmoney = tmoney;
	}

	public PurchaseVO() {
		super();
	}

	public PurchaseVO(int c_no, int total, int amount, String way, int rmoney, int cmoney, int tmoney) {
		super();
		this.c_no = c_no;
		this.total = total;
		this.amount = amount;
		this.way = way;
		this.rmoney = rmoney;
		this.cmoney = cmoney;
		this.tmoney = tmoney;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public int getRmoney() {
		return rmoney;
	}

	public void setRmoney(int rmoney) {
		this.rmoney = rmoney;
	}

	public int getCmoney() {
		return cmoney;
	}

	public void setCmoney(int cmoney) {
		this.cmoney = cmoney;
	}

	public int getTmoney() {
		return tmoney;
	}

	public void setTmoney(int tmoney) {
		this.tmoney = tmoney;
	}

}

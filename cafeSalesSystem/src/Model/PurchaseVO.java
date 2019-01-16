package Model;

//판매내역을 저장하는 VO
public class PurchaseVO {

	private int no;// 판매내역 일련번호
	private int c_no;// 구매한 고객 번호(비회원 구매시에는 임의의 무명회원에 입력후 포인트 삭제?)
	private String sdate;// 판매한 시각
	private int total;// 개별 판매내역의 판매금액의 합
	private int amount;// 개별 판매내역의 판매량의 합
	private String way;// 판매 방식 현금/카드
	private int rmoney;// 총 현금 판매액
	private int cmoney;// 총 카드 판매액
	private int tmoney;// 총 매출액

	
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

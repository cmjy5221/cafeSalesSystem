package Model;

//고객 정보관리 용 고객정보 VO
public class CustomerVO {

	private int c_no;// 고객관리용 일련번호
	private String c_name;// 회원 이름
	private String c_phone;// 회원 연락처
	private String c_point;// 적립된 포인트
	private String c_regdate;// 가입날짜

	public CustomerVO(int c_no, String c_name, String c_phone, String c_point, String c_regdate) {
		super();
		this.c_no = c_no;
		this.c_name = c_name;
		this.c_phone = c_phone;
		this.c_point = c_point;
		this.c_regdate = c_regdate;
	}

	public CustomerVO() {
		super();
	}

	public CustomerVO(String c_name, String c_phone, String c_point) {
		super();
		this.c_name = c_name;
		this.c_phone = c_phone;
		this.c_point = c_point;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_point() {
		return c_point;
	}

	public void setC_point(String c_point) {
		this.c_point = c_point;
	}

	public String getC_regdate() {
		return c_regdate;
	}

	public void setC_regdate(String c_regdate) {
		this.c_regdate = c_regdate;
	}

}

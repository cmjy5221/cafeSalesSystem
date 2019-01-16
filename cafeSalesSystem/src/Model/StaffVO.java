package Model;

//���� ���� ���� ���� VO
public class StaffVO {

	private int s_no;// ���� ���� �Ϸù�ȣ
	private String s_name;// ���� �̸�
	private String s_phone;// ���� ����ó
	private String s_ID;// ���� �α��� ���̵�
	private String s_PW;// ���� �α��� ��й�ȣ
	private String s_job;// ���� ���� (�Ŵ���/�Ϲ�����)

	public StaffVO() {
		super();
	}

	public StaffVO(int s_no, String s_name, String s_phone, String s_ID, String s_PW, String s_job) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_ID = s_ID;
		this.s_PW = s_PW;
		this.s_job = s_job;
	}

	public StaffVO(String s_name, String s_phone, String s_ID, String s_PW, String s_job) {
		super();
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_ID = s_ID;
		this.s_PW = s_PW;
		this.s_job = s_job;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_phone() {
		return s_phone;
	}

	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}

	public String getS_ID() {
		return s_ID;
	}

	public void setS_ID(String s_ID) {
		this.s_ID = s_ID;
	}

	public String getS_PW() {
		return s_PW;
	}

	public void setS_PW(String s_PW) {
		this.s_PW = s_PW;
	}

	public String getS_job() {
		return s_job;
	}

	public void setS_job(String s_job) {
		this.s_job = s_job;
	}

}

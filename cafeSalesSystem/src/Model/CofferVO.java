package Model;

//���� ���縦 �����ϴµ� ����� VO
public class CofferVO {

	private int sijae;// ���� ����
	private String nowDate;// ���簡 ����� ������ ����

	public CofferVO(int sijae, String nowDate) {
		super();
		this.sijae = sijae;
		this.nowDate = nowDate;
	}

	public CofferVO() {
		super();
	}

	public int getSijae() {
		return sijae;
	}

	public void setSijae(int sijae) {
		this.sijae = sijae;
	}

	public String getNowDate() {
		return nowDate;
	}

	public void setNowDate(String nowDate) {
		this.nowDate = nowDate;
	}

}

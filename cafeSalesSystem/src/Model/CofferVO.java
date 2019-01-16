package Model;

//현금 시재를 저장하는데 사용할 VO
public class CofferVO {

	private int sijae;// 현금 시재
	private String nowDate;// 시재가 변경될 때마다 저장

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

package vo.player;

public class YearVO {
	
	private int year_seq;
	private int year_number;

	public YearVO() {
		// TODO Auto-generated constructor stub
	}

	public YearVO(int year_seq, int year_number) {
		this.year_seq=year_seq;
		this.year_number=year_number;
	}

	public int getYear_seq() {
		return year_seq;
	}

	public void setYear_seq(int year_seq) {
		this.year_seq = year_seq;
	}

	public int getYear_number() {
		return year_number;
	}

	public void setYear_number(int year_number) {
		this.year_number = year_number;
	}
	
	
	
}

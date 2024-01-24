package vo.player;

public class PositionVO {
	
	private int position_seq;
	private String position_abb; 	//ex) sp, dh, 1b
	private String position_name;

	public PositionVO() {
		// TODO Auto-generated constructor stub
	}
	
	public PositionVO(int position_seq, String position_abb, String position_name) {
		this.position_seq=position_seq;
		this.position_abb=position_abb;
		this.position_name=position_name;
	}

	public int getPosition_seq() {
		return position_seq;
	}

	public void setPosition_seq(int position_seq) {
		this.position_seq = position_seq;
	}

	public String getPosition_abb() {
		return position_abb;
	}

	public void setPosition_abb(String position_abb) {
		this.position_abb = position_abb;
	}

	public String getPosition_name() {
		return position_name;
	}

	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
	
	
	
}

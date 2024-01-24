package vo.player;

public class PitcherVO {
	
	private int pitcher_seq;
	private int team_seq;
	private int player_seq;
	private int year_seq;
	private int position_seq;
	private int player_type_seq;
	private String pitcher_img;
	private int overall;
	
	public PitcherVO() {
		// TODO Auto-generated constructor stub
	}
	
	public PitcherVO(int pitcher_seq, int team_seq, int player_seq, int year_seq, int position_seq, int player_type_seq, String pitcher_img, int overall) {
		this.pitcher_seq=pitcher_seq;
		this.team_seq=team_seq;
		this.player_seq=player_seq;
		this.year_seq=year_seq;
		this.position_seq=position_seq;
		this.player_type_seq=player_type_seq;
		this.pitcher_img=pitcher_img;
		this.overall=overall;
	}

	public int getPitcher_seq() {
		return pitcher_seq;
	}

	public void setPitcher_seq(int pitcher_seq) {
		this.pitcher_seq = pitcher_seq;
	}

	public int getTeam_seq() {
		return team_seq;
	}

	public void setTeam_seq(int team_seq) {
		this.team_seq = team_seq;
	}

	public int getPlayer_seq() {
		return player_seq;
	}

	public void setPlayer_seq(int player_seq) {
		this.player_seq = player_seq;
	}

	public int getYear_seq() {
		return year_seq;
	}

	public void setYear_seq(int year_seq) {
		this.year_seq = year_seq;
	}

	public int getPosition_seq() {
		return position_seq;
	}

	public void setPosition_seq(int position_seq) {
		this.position_seq = position_seq;
	}

	public int getPlayer_type_seq() {
		return player_type_seq;
	}

	public void setPlayer_type_seq(int player_type_seq) {
		this.player_type_seq = player_type_seq;
	}

	public String getPitcher_img() {
		return pitcher_img;
	}

	public void setPitcher_img(String pitcher_img) {
		this.pitcher_img = pitcher_img;
	}

	public int getOverall() {
		return overall;
	}

	public void setOverall(int overall) {
		this.overall = overall;
	}
	
	

}

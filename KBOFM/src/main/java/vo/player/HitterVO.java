package vo.player;

public class HitterVO {
	
	private int hitter_seq;
	private int team_seq;
	private int player_seq;
	private int year_seq;
	private int main_position_seq;
	private int add_position_seq;
	private int player_type_seq;
	private String hitter_img;
	private int overall;
	
	public HitterVO() {
		// TODO Auto-generated constructor stub
	}
	
	public HitterVO(int hitter_seq, int team_seq, int player_seq, int year_seq, int main_position_seq, int add_position_seq, int player_type_seq, String hitter_img, int overall) {
		this.hitter_seq=hitter_seq;
		this.team_seq=team_seq;
		this.player_seq=player_seq;
		this.year_seq=year_seq;
		this.main_position_seq=main_position_seq;
		this.add_position_seq=add_position_seq;
		this.player_type_seq=player_type_seq;
		this.hitter_img=hitter_img;
		this.overall=overall;
	}

	public int getHitter_seq() {
		return hitter_seq;
	}

	public void setHitter_seq(int hitter_seq) {
		this.hitter_seq = hitter_seq;
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

	public int getMain_position_seq() {
		return main_position_seq;
	}

	public void setMain_position_seq(int main_position_seq) {
		this.main_position_seq = main_position_seq;
	}

	public int getAdd_position_seq() {
		return add_position_seq;
	}

	public void setAdd_position_seq(int add_position_seq) {
		this.add_position_seq = add_position_seq;
	}

	public int getPlayer_type_seq() {
		return player_type_seq;
	}

	public void setPlayer_type_seq(int player_type_seq) {
		this.player_type_seq = player_type_seq;
	}

	public String getHitter_img() {
		return hitter_img;
	}

	public void setHitter_img(String hitter_img) {
		this.hitter_img = hitter_img;
	}

	public int getOverall() {
		return overall;
	}

	public void setOverall(int overall) {
		this.overall = overall;
	}

	
	
}

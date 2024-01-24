package vo.myteam;

public class MyTeamPlayerVO {
	
	private int my_team_player_seq;
	private int my_team_seq;
	private int player_type;
	private int player_seq;
	private int player_grade;
	
	public MyTeamPlayerVO() {
		// TODO Auto-generated constructor stub
	}
	
	public MyTeamPlayerVO(int my_team_player_seq, int my_team_seq, int player_type, int player_seq, int player_grade) {
	    this.my_team_player_seq = my_team_player_seq;
	    this.my_team_seq = my_team_seq;
	    this.player_type = player_type;
	    this.player_seq = player_seq;
	    this.player_grade = player_grade;
	}

	public int getMy_team_player_seq() {
		return my_team_player_seq;
	}

	public void setMy_team_player_seq(int my_team_player_seq) {
		this.my_team_player_seq = my_team_player_seq;
	}

	public int getMy_team_seq() {
		return my_team_seq;
	}

	public void setMy_team_seq(int my_team_seq) {
		this.my_team_seq = my_team_seq;
	}

	public int getPlayer_type() {
		return player_type;
	}

	public void setPlayer_type(int player_type) {
		this.player_type = player_type;
	}

	public int getPlayer_seq() {
		return player_seq;
	}

	public void setPlayer_seq(int player_seq) {
		this.player_seq = player_seq;
	}

	public int getPlayer_grade() {
		return player_grade;
	}

	public void setPlayer_grade(int player_grade) {
		this.player_grade = player_grade;
	}
	
	

}

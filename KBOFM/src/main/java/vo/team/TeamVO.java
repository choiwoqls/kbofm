package vo.team;

import java.sql.Date;

public class TeamVO {
	
	private int team_seq;
	private String team_name;
	private int team_unq_seq;
	private String team_logo;
	private String team_url;
	private int team_since;
	
	public TeamVO() {
		// TODO Auto-generated constructor stub
	}
		
	public TeamVO(int team_seq, String team_name, int team_unq_seq, String team_logo, String team_url, int team_since) {
		this.team_seq=team_seq;
		this.team_name=team_name;
		this.team_unq_seq=team_unq_seq;
		this.team_logo=team_logo;
		this.team_url=team_url;
		this.team_since=team_since;
	}

	public int getTeam_seq() {
		return team_seq;
	}

	public void setTeam_seq(int team_seq) {
		this.team_seq = team_seq;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public int getTeam_unq_seq() {
		return team_unq_seq;
	}

	public void setTeam_unq_seq(int team_unq_seq) {
		this.team_unq_seq = team_unq_seq;
	}

	public String getTeam_logo() {
		return team_logo;
	}

	public void setTeam_logo(String team_logo) {
		this.team_logo = team_logo;
	}

	public String getTeam_url() {
		return team_url;
	}

	public void setTeam_url(String team_url) {
		this.team_url = team_url;
	}

	public int getTeam_since() {
		return team_since;
	}

	public void setTeam_since(int team_since) {
		this.team_since = team_since;
	}
	
	
	

}

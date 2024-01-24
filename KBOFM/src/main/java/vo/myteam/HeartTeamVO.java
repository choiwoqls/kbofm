package vo.myteam;

public class HeartTeamVO {
	
	private int heart_team_seq;
    private int user_seq;
    private int my_lineup_seq;

    public HeartTeamVO() {
		// TODO Auto-generated constructor stub
	}
    
    public HeartTeamVO(int heart_team_seq, int user_seq, int my_lineup_seq) {
        this.heart_team_seq = heart_team_seq;
        this.user_seq = user_seq;
        this.my_lineup_seq = my_lineup_seq;
    }

	public int getHeart_team_seq() {
		return heart_team_seq;
	}

	public void setHeart_team_seq(int heart_team_seq) {
		this.heart_team_seq = heart_team_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public int getMy_lineup_seq() {
		return my_lineup_seq;
	}

	public void setMy_lineup_seq(int my_lineup_seq) {
		this.my_lineup_seq = my_lineup_seq;
	}
    
    

}

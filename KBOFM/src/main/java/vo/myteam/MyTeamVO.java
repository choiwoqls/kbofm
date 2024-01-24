package vo.myteam;

public class MyTeamVO {
	
	private int my_team_seq;
    private int user_seq;
    
    public MyTeamVO() {
		// TODO Auto-generated constructor stub
	}

    public MyTeamVO(int my_team_seq, int user_seq) {
        this.my_team_seq = my_team_seq;
        this.user_seq = user_seq;
    }

	public int getMy_team_seq() {
		return my_team_seq;
	}

	public void setMy_team_seq(int my_team_seq) {
		this.my_team_seq = my_team_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
    
    

}

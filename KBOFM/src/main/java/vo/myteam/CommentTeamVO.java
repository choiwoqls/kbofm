package vo.myteam;

import java.sql.Date;

public class CommentTeamVO {
	
	private int comment_team_seq;
    private int user_seq;
    private int my_lineup_seq;
    private String content;
    private Date uptime;
    
    public CommentTeamVO() {
		// TODO Auto-generated constructor stub
	}

    public CommentTeamVO(int comment_team_seq, int user_seq, int my_lineup_seq, String content, Date uptime) {
        this.comment_team_seq = comment_team_seq;
        this.user_seq = user_seq;
        this.my_lineup_seq = my_lineup_seq;
        this.content = content;
        this.uptime = uptime;
    }

	public int getComment_team_seq() {
		return comment_team_seq;
	}

	public void setComment_team_seq(int comment_team_seq) {
		this.comment_team_seq = comment_team_seq;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
    
    


}

package vo.community;

import java.sql.Date;

public class CommentCommVO {

	private int comment_comm_seq;
    private int user_seq;
    private int community_seq;
    private String content;
    private Date uptime;
    
    public CommentCommVO() {
		// TODO Auto-generated constructor stub
	}

    public CommentCommVO(int comment_comm_seq, int user_seq, int community_seq, String content, Date uptime) {
        this.comment_comm_seq = comment_comm_seq;
        this.user_seq = user_seq;
        this.community_seq = community_seq;
        this.content = content;
        this.uptime = uptime;
    }

	public int getComment_comm_seq() {
		return comment_comm_seq;
	}

	public void setComment_comm_seq(int comment_comm_seq) {
		this.comment_comm_seq = comment_comm_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public int getCommunity_seq() {
		return community_seq;
	}

	public void setCommunity_seq(int community_seq) {
		this.community_seq = community_seq;
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

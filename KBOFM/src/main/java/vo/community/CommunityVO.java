package vo.community;

import java.sql.Date;

public class CommunityVO {
	
	private int community_seq;
	private int user_seq;
	private String title;
	private String content;
	private Date uptime;

	public CommunityVO() {
		// TODO Auto-generated constructor stub
	}
	
	public CommunityVO(int community_seq, int user_seq, String title, String content, Date uptime) {
		this.community_seq=community_seq;
		this.user_seq=user_seq;
		this.title=title;
		this.content=content;
		this.uptime=uptime;
	}

	public int getCommunity_seq() {
		return community_seq;
	}

	public void setCommunity_seq(int community_seq) {
		this.community_seq = community_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

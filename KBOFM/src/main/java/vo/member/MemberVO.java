package vo.member;

import java.sql.Date;

public class MemberVO {

	private int member_seq;
	private String nickname;
	private String member_id;
	private String password;
	private String email;
	private String profile_img;
	private int home_team;
	private Date join_date;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberVO(int member_seq, String nickname, String member_id, String password, String email,int home_team,Date join_date) {
		this.member_seq=member_seq;
		this.nickname=nickname;
		this.member_id=member_id;
		this.password=password;
		this.email=email;
		this.home_team=home_team;
		this.join_date=join_date;
	}

	public int getmember_seq() {
		return member_seq;
	}

	public void setmember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}

	public int getHome_team() {
		return home_team;
	}

	public void setHome_team(int home_team) {
		this.home_team = home_team;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
}

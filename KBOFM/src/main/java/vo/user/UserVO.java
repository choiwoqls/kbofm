package vo.user;

import java.sql.Date;

public class UserVO {

	private int user_seq;
	private String nickname;
	private String user_id;
	private String password;
	private String email;
	private String profile_img;
	private int home_team;
	private Date join_date;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserVO(int user_seq, String nickname, String user_id, String password, String email,int home_team,Date join_date) {
		this.user_seq=user_seq;
		this.nickname=nickname;
		this.user_id=user_id;
		this.password=password;
		this.email=email;
		this.home_team=home_team;
		this.join_date=join_date;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

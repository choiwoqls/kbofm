package vo.player;

import java.sql.Date;

public class PlayerVO {
	
	private int player_seq;
	private String player_name;
	private Date player_born;
	private int player_height;
	private int player_weight;
	private int throw_h;
	private int hit_h;
	private String player_skil;

	
	public PlayerVO() {
		// TODO Auto-generated constructor stub
	}
	
	public PlayerVO(int player_seq, String player_name, Date player_born, int player_height, int player_weight, int throw_h, int hit_h, String player_skil) {
		this.player_seq=player_seq;
		this.player_name=player_name;
		this.player_born=player_born;
		this.player_height=player_height;
		this.player_weight=player_weight;
		this.throw_h=throw_h;
		this.hit_h=hit_h;
		this.player_skil=player_skil;
	}

	public int getPlayer_seq() {
		return player_seq;
	}

	public void setPlayer_seq(int player_seq) {
		this.player_seq = player_seq;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public Date getPlayer_born() {
		return player_born;
	}

	public void setPlayer_born(Date player_born) {
		this.player_born = player_born;
	}

	public int getPlayer_height() {
		return player_height;
	}

	public void setPlayer_height(int player_height) {
		this.player_height = player_height;
	}

	public int getPlayer_weight() {
		return player_weight;
	}

	public void setPlayer_weight(int player_weight) {
		this.player_weight = player_weight;
	}

	public int getThrow_h() {
		return throw_h;
	}

	public void setThrow_h(int throw_h) {
		this.throw_h = throw_h;
	}

	public int getHit_h() {
		return hit_h;
	}

	public void setHit_h(int hit_h) {
		this.hit_h = hit_h;
	}

	public String getPlayer_skil() {
		return player_skil;
	}

	public void setPlayer_skil(String player_skil) {
		this.player_skil = player_skil;
	}
	
	
}

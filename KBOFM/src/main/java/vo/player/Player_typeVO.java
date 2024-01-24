package vo.player;

public class Player_typeVO {
	
	private int player_type_seq;
	private int player_pos;		//0 - 투수 1 - 타자
	private String player_type_name;

	
	public Player_typeVO() {
		// TODO Auto-generated constructor stub
	}
	
	public Player_typeVO(int player_type_seq, int player_pos, String player_type_name) {
		this.player_type_seq=player_type_seq;
		this.player_pos=player_pos;
		this.player_type_name=player_type_name;
	}

	public int getPlayer_type_seq() {
		return player_type_seq;
	}

	public void setPlayer_type_seq(int player_type_seq) {
		this.player_type_seq = player_type_seq;
	}

	public int getPlayer_pos() {
		return player_pos;
	}

	public void setPlayer_pos(int player_pos) {
		this.player_pos = player_pos;
	}

	public String getPlayer_type_name() {
		return player_type_name;
	}

	public void setPlayer_type_name(String player_type_name) {
		this.player_type_name = player_type_name;
	}
	
	
	
}

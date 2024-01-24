package vo.player;

public class Player_SkilVO {
	
	private int player_skil_seq;
	private String player_skil_head;
	private String player_skil_info;
	
	public Player_SkilVO() {
		// TODO Auto-generated constructor stub
	}
	
	public Player_SkilVO(int player_skil_seq, String player_skil_head, String player_skil_info) {
		this.player_skil_seq=player_skil_seq;
		this.player_skil_head=player_skil_head;
		this.player_skil_info=player_skil_info;
	}

	public int getPlayer_skil_seq() {
		return player_skil_seq;
	}

	public void setPlayer_skil_seq(int player_skil_seq) {
		this.player_skil_seq = player_skil_seq;
	}

	public String getPlayer_skil_head() {
		return player_skil_head;
	}

	public void setPlayer_skil_head(String player_skil_head) {
		this.player_skil_head = player_skil_head;
	}

	public String getPlayer_skil_info() {
		return player_skil_info;
	}

	public void setPlayer_skil_info(String player_skil_info) {
		this.player_skil_info = player_skil_info;
	}
	
	
	


}

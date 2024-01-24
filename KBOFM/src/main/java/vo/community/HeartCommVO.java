package vo.community;

public class HeartCommVO {
	
	private int heart_comm_seq;
    private int user_seq;
    private int community_seq;
    
    public HeartCommVO() {
		// TODO Auto-generated constructor stub
	}

    public HeartCommVO(int heart_comm_seq, int user_seq, int community_seq) {
        this.heart_comm_seq = heart_comm_seq;
        this.user_seq = user_seq;
        this.community_seq = community_seq;
    }

	public int getHeart_comm_seq() {
		return heart_comm_seq;
	}

	public void setHeart_comm_seq(int heart_comm_seq) {
		this.heart_comm_seq = heart_comm_seq;
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

    
    
    
    
}

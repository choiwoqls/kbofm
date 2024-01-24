package vo.pack;

public class PackOpenVO {
	
	private int pack_open_seq;
    private int pack_seq;
    private int user_seq;
    private int pack_open_dday;
   
    public PackOpenVO() {
		// TODO Auto-generated constructor stub
	}

    public PackOpenVO(int pack_open_seq, int pack_seq, int user_seq, int pack_open_dday) {
        this.pack_open_seq = pack_open_seq;
        this.pack_seq = pack_seq;
        this.user_seq = user_seq;
        this.pack_open_dday = pack_open_dday;
    }

	public int getPack_open_seq() {
		return pack_open_seq;
	}

	public void setPack_open_seq(int pack_open_seq) {
		this.pack_open_seq = pack_open_seq;
	}

	public int getPack_seq() {
		return pack_seq;
	}

	public void setPack_seq(int pack_seq) {
		this.pack_seq = pack_seq;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public int getPack_open_dday() {
		return pack_open_dday;
	}

	public void setPack_open_dday(int pack_open_dday) {
		this.pack_open_dday = pack_open_dday;
	}
    
    

}

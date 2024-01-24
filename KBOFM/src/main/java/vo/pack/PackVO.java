package vo.pack;

public class PackVO {
	
	private int pack_seq;
    private String pack_name;
    private int pack_type;
    private int pack_grade;
    private String pack_img;
    
    public PackVO() {
		// TODO Auto-generated constructor stub
	}

    public PackVO(int pack_seq, String pack_name, int pack_type, int pack_grade, String pack_img) {
        this.pack_seq = pack_seq;
        this.pack_name = pack_name;
        this.pack_type = pack_type;
        this.pack_grade = pack_grade;
        this.pack_img = pack_img;
    }

	public int getPack_seq() {
		return pack_seq;
	}

	public void setPack_seq(int pack_seq) {
		this.pack_seq = pack_seq;
	}

	public String getPack_name() {
		return pack_name;
	}

	public void setPack_name(String pack_name) {
		this.pack_name = pack_name;
	}

	public int getPack_type() {
		return pack_type;
	}

	public void setPack_type(int pack_type) {
		this.pack_type = pack_type;
	}

	public int getPack_grade() {
		return pack_grade;
	}

	public void setPack_grade(int pack_grade) {
		this.pack_grade = pack_grade;
	}

	public String getPack_img() {
		return pack_img;
	}

	public void setPack_img(String pack_img) {
		this.pack_img = pack_img;
	}
    
    

}

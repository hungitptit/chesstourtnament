package chesstournamentmanagement.model;


public class Kythu extends Thanhvien{

	private int userId;
	
	private int elotruocgiai;

	public Kythu(int userId, int elotruocgiai) {
		super();
		this.userId = userId;
		this.elotruocgiai = elotruocgiai;
	}
	public Kythu() {
		// TODO Auto-generated constructor stub'
		super();
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getElotruocgiai() {
		return elotruocgiai;
	}

	public void setElotruocgiai(int elotruocgiai) {
		this.elotruocgiai = elotruocgiai;
	}
	
	
}

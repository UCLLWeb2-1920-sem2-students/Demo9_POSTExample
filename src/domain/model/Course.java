package domain.model;

public class Course {
	private String title;
	private String code;
	private int credits = 3;
	private int contactHours = 2;
	
	public static final int LOAD_PER_CREDIT = 25;
	
	public Course(String title, String code, int credits, int contactHours) {
		this(code);
		this.setTitle(title);
		this.setCredits(credits);
		this.setContactHours(contactHours);
	}
	
	public Course(String code) {
		super();
		this.setCode(code);
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	private void setCode(String code) {
		this.code = code;
	}

	private int getCredits() {
		return credits;
	}

	private void setCredits(int credits) {
		this.credits = credits;
	}
	
	private int getContactHours() {
		return contactHours;
	}

	public void setContactHours(int contactHours) {
		this.contactHours = contactHours;
	}

	
	public int getWorkLoad(){
		return getCredits() * LOAD_PER_CREDIT;
	}
	
	public int getSelfStudy(){
		int hoursInSemester = getContactHours() * 13;
		return getWorkLoad() - hoursInSemester;
	}
	
	public int getRemainingWorkLoad(int hoursWorked){
		return getWorkLoad() - hoursWorked;
	}
	
	public int getRemainingSelfStudy(int hoursWorked){
		return getSelfStudy() - hoursWorked;
	}
}

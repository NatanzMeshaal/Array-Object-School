package School;

public class Student extends Person {
    private int studentNumber;
    private int score;
    private String major;
	
	public Student(String n, int a, int u, int s, String m) {
		super(n, a);
		this.studentNumber = u;
		this.score = s;
		this.major = m;
	}

	public int getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void print() {
		super.print();
		System.out.println("Number : " +studentNumber);
		System.out.println("Score : " +score);
		System.out.println("Major : " +major);
	}
}

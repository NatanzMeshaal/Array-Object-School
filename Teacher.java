package School;

public class Teacher extends Person {
    private String subject;

	public Teacher(String n, int a, String s) {
		super(n, a);
		subject = s;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.println("Mapel : " +subject);
	}
}

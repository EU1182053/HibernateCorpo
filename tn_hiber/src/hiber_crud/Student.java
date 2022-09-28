package hiber_crud;
import javax.persistence.*;

@Entity
@Table(name="stu_db")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int sid;
	private String course;
	private double average;
	private String sname;
	public Student(String string, String string2, double d) {
		super();
		this.sname = sname;
		this.course = course;
		this.average = average;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student load(Class<Student> class1, Integer i) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(Student st) {
		// TODO Auto-generated method stub
		
	}
	
	

}

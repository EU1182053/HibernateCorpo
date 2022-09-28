package layer.entity;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="empinfo")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empname;
	private double salary;
	
	@OneToOne
	@Cascade(CascadeType.ALL)
	private Address address;

	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", salary=" + salary + ", address=" + address + "]";
	}

	public Employee(String empname, double salary, Address address) {
		super();
		this.empname = empname;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
}
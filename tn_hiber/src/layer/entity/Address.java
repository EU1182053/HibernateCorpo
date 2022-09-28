package layer.entity;
import javax.persistence.*;

@Entity
@Table(name="addressData")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Employee employee;
	
	private String addLine1;
	private String city;
	private String zipcode;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", employee=" + employee + ", addLine1=" + addLine1 + ", city=" + city
				+ ", zipcode=" + zipcode + "]";
	}
	public Address(String addLine1, String city, String zipcode) {
		super();
		
		this.addLine1 = addLine1;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public Address() {
		
	}
	
}
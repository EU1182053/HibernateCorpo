package layer;

import layer.dao.AddressDao;
import layer.dao.EmployeeDao;
import layer.dao.StudentDao;
import layer.entity.Address;
import layer.entity.Employee;
import layer.entity.Student;

public class Main {

	public static void main(String[] args) {
//		StudentDao std = new StudentDao();
//		
//		Student s = new Student("sid1", "BE Tech", 18.0);
////		std.addStudent(s);
//		std.listStudent();
		
		
		
		Address address = new Address("virar", "virar", "410305");
		
		Employee emp = new Employee("siddhesh sawant", 12000.0, address);
		
		
		

		EmployeeDao empDao = new EmployeeDao();
		empDao.addEmployee(emp);
		
		empDao.hqlqueries();
	}
}

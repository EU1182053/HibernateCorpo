package layer.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import layer.entity.Employee;
import layer.utility.HibernateUtility;

public class EmployeeDao {
	Session sess = HibernateUtility.getSessionFactory().openSession();

	Transaction tx = sess.beginTransaction();
	public void addEmployee(Employee employee) {
	
	

//	Student st = new Student(name, course, average);

	Integer i = (Integer) sess.save(employee);

	tx.commit();

	
	
	}
	
	public void hqlqueries() {
		
		Query qr = sess.createQuery("from Employee where id= :id");
		qr.setInteger("id", 8);
		
		Employee e = (Employee)  qr.uniqueResult();
		
		System.out.println(""+e.getId()+" "+e.getSalary()+" "+e.getAddress().getCity());
		
	}
}

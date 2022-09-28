package layer.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import layer.entity.Address;

import layer.utility.HibernateUtility;

public class AddressDao {

	Session sess = HibernateUtility.getSessionFactory().openSession();

	Transaction tx = sess.beginTransaction();
	public void addAddress(Address address) {
	
	

//	Student st = new Student(name, course, average);

	Integer i = (Integer) sess.save(address);

	tx.commit();

	
	
	}
}

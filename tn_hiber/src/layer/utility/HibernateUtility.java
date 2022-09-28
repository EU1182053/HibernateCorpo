package layer.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import layer.entity.Address;
import layer.entity.Employee;
import layer.entity.Student;

public class HibernateUtility {
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		
		Properties prop = new Properties();
		prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/demo");
		prop.put(Environment.USER, "root");
		prop.put(Environment.PASS, "root");
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		prop.put(Environment.SHOW_SQL, "true");
		prop.put(Environment.HBM2DDL_AUTO, "update");
		
		cfg.setProperties(prop);
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Address.class);
		sf = cfg.buildSessionFactory();
		
	
		return sf;
	}
	
}
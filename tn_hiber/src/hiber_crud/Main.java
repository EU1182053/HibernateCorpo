package hiber_crud;

import java.util.Iterator;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

@Entity
@Table(name = "stu_db")

public class Main {

	static SessionFactory sf;

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		 sf = cfg.buildSessionFactory();

		Main m = new Main();
//		m.addStudent("sid", "BE", 193.8);
//		m.listStudent();
		m.updateStudent(1);
		
	}

	public Integer addStudent(String name, String course, double average) {

		Session sess = sf.openSession();

		Transaction tx = sess.beginTransaction();

		Student st = new Student(name, course, average);

		Integer i = (Integer) sess.save(st);

		tx.commit();

		return i;

	}

	public void deletestudent(Integer i) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		Student s = (Student) sess.get(Student.class, i);
		sess.delete(s);
		tx.commit();
	}
	
	@SuppressWarnings("rawtypes")
	public void listStudent()
	{
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		java.util.List ls=sess.createQuery("from Student").list();
		for(Iterator it=ls.iterator();it.hasNext();)
 // one by one want print the data
		{
			Student s=(Student)it.next();
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getCourse());
			System.out.println(s.getAverage());


		}

	}
	
	public Integer updateStudent(Integer i) {
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		 Student st=(Student)sess.load(Student.class,i);
         st.setSname("new Name");
         sess.update(st);
         tx.commit();
		return 0;
		
	}
}

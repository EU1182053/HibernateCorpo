package layer.dao;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import layer.entity.Student;
import layer.utility.HibernateUtility;

public class StudentDao {
	
	Session sess = HibernateUtility.getSessionFactory().openSession();

	Transaction tx = sess.beginTransaction();
	
	public Integer addStudent(Student std) {

	

//		Student st = new Student(name, course, average);

		Integer i = (Integer) sess.save(std);

		tx.commit();

		return i;

	}
	
	public void deletestudent(Integer i) {
		
		Student s = (Student) sess.get(Student.class, i);
		sess.delete(s);
		tx.commit();
	}
	
	@SuppressWarnings("rawtypes")
	public void listStudent()
	{
	
		Session sess = HibernateUtility.getSessionFactory().openSession();

		Transaction tx = sess.beginTransaction();
		
		Criteria cr = sess.createCriteria(Student.class);
		
		cr.add(Restrictions.gt("average", 80.0));
		
		java.util.List ls= cr.list();
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
		
		
		 Student st=(Student)sess.load(Student.class,i);
         st.setSname("new Name");
         sess.update(st);
         tx.commit();
		return 0;
		
	}

}

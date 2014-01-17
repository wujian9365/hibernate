import org.hibernate.Session;
import org.hibernate.Transaction;

import sessionfactory.HibernateSessionFactory;


public class ins {
	public  static void main(String[] args){
		Person person = new Person("nininini",22);
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		session.save(person);
		tran.commit();
		session.close();
		
	}
}

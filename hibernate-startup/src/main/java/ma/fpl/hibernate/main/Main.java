package ma.fpl.hibernate.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.fpl.hibernate.config.HibernateConfig;
import ma.fpl.hibernate.entity.Employe;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Employe e1 = new Employe("sma", "cj");
		session.save(e1);
		t.commit();
		session.close();

	}

}

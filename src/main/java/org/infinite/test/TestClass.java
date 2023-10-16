package org.infinite.test;

import java.sql.Timestamp;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.pojo.Login;
import org.infinite.utils.HibernateUtils;

public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.setName("Yash");
		login.setPassword("Yash123");
		login.setTimestamp((new Timestamp(System.currentTimeMillis())));
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			// Insert a new login record in the database.
			session.save(login);
			// Commit hibernate transaction if no exception occurs.
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				// Roll back if any exception occurs.
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}
}

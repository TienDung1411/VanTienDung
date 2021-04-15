package org.o7planning.HibernateTutorial;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class Test {
public static void main(String[] args) {
	Transaction transaction = null;
    try  {
    	Session session = HibernateUtils.getSessionFactory().openSession();
        // start a transaction
        transaction = session.beginTransaction();
        List < Staff > staff = session.createQuery("from Staff", Staff.class).list();

        for (Staff emp : staff) {
            System.out.println(emp.getStaff_id()  );
            System.out.println(emp.getStaff_name()  );
            System.out.println(emp.getStaff_code()  );
            System.out.println(emp.getBirth_day()  );
        }
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}
}	 

package org.o7planning.HibernateTutorial;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

public class Test {
public static void main(String[] args) {
	Transaction transaction = null;
    try  {
    	Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List < Staff > st = session.createQuery(" from Staff", Staff.class).list();
        
        for (Staff emp : st) {
            System.out.println(emp.getStaff_id() +"-"+ emp.getStaff_name()+
            		"-"+emp.getStaff_code()+"-" + emp.getBirth_day());
            
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

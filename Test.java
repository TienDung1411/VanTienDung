package org.o7planning.HibernateTutorial;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class Test {
public static void main(String[] args) {
	
	Test.update(2, "123456789");
	
	Test.delete(2);
	
	Transaction transaction = null;
    try  {
    	Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Query < Staff > query = session.createQuery("from Staff", Staff.class);
        List < Staff > st = query.list();
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

// Hàm thêm dữ liệu
public static void addstaff(long id, String name, String code, Date birth ) {
	Transaction transaction = null;
    try  {
    	Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Staff newst = new Staff();
        newst.setStaff_id(id);
        newst.setStaff_name(name);
        newst.setStaff_code(code);
        newst.setBirth_day(birth);
        session.saveOrUpdate(newst);
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}

// Hàm thay đổi dữ liệu tại staff_id=?
public static void update(long staff_id, String staff_code) {
	Transaction transaction = null;
    try  {
    	Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Staff employee = (Staff) session.get(Staff.class, staff_id);
        employee.setStaff_code(staff_code);
        session.update(employee);
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}

// Hàm xóa dữ liệu tại staff_id=?
public static void delete(long staff_id) {
	Transaction transaction = null;
    try  {
    	Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Staff employee = (Staff) session.get(Staff.class, staff_id);
        session.delete(employee);
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}

}	

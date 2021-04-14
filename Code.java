package org.o7planning.HibernateTutorial;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Code {
	private static SessionFactory factory;
	public static void main(String[] args) {
		try {
			 factory = new Configuration().configure().buildSessionFactory();
	    } catch (Throwable ex) {
	    	System.out.println("Có lỗi xảy ra");
	        ex.printStackTrace();
	    }
		
		Code sta1=new Code();
		
		// Sửa staff_code thành "1234567" tại staff_id=??
//		sta1.updatestaff(??, "1234567");
		
		// Xóa dữ liệu tại staff_id=??
	//	sta1.deletestaff(??);
		
		
		
		// Hiển thị bảng
		sta1.liststaff();
	}
	
	
	
// Hàm hiển thị
	public void liststaff() {
		  Session session = factory.openSession();
		  Transaction tx = null;
		  try {
		   tx = session.beginTransaction();
		   List employees = session.createQuery("FROM Staff").list();
		   for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
		    Staff employee = (Staff) iterator.next();
		    System.out.print("Staff_id: " + employee.getStaff_id());
		    System.out.print("Staff_name: " + employee.getStaff_name());
		    System.out.print("Staff_code: " + employee.getStaff_code());
		    System.out.println("birth_day: " + employee.getBirth_day());
		   }
		   tx.commit();
		  } catch (HibernateException e) {
		   if (tx != null)
		    tx.rollback();
		   e.printStackTrace();
		  } finally {
		   session.close();
		  }
		 } 
	
	
// Hàm thêm dữ liệu
	public Integer addEmployee(BigInteger id, String name, String code, Date birth) {
		  Session session = factory.openSession();
		  Transaction tx = null;
		  Integer employeeID = null;
		  try {
		   tx = session.beginTransaction();
		   Staff employee = new Staff(id, name, code, birth);
		   employeeID = (Integer) session.save(employee);
		   tx.commit();
		  } catch (HibernateException e) {
		   if (tx != null)
		    tx.rollback();
		   e.printStackTrace();
		  } finally {
		   session.close();
		  }
		  return employeeID;
		 }

	
	
	// Hàm sửa dữ liệu
	 public void updatestaff(BigInteger staff_id, String staff_code) {
		  Session session = factory.openSession();
		  Transaction tx = null;
		  try {
		   tx = session.beginTransaction();
		   Staff employee = (Staff) session.get(Staff.class, staff_id);
		   employee.setStaff_code(staff_code);
		   session.update(employee);
		   tx.commit();
		  } catch (HibernateException e) {
		   if (tx != null)
		    tx.rollback();
		   e.printStackTrace();
		  } finally {
		   session.close();
		  }
		 }
	
	 
	 // Hàm xóa dữ liệu
	 public void deletestaff(BigInteger staff_id) {
		  Session session = factory.openSession();
		  Transaction tx = null;
		  try {
		   tx = session.beginTransaction();
		   Staff employee = (Staff) session.get(Staff.class, staff_id);
		   session.delete(employee);
		   tx.commit();
		  } catch (HibernateException e) {
		   if (tx != null)
		    tx.rollback();
		   e.printStackTrace();
		  } finally {
		   session.close();
		  }
		 }
}
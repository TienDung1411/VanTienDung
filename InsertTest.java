package com.javatpoint;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

public class InsertTest {
	public static void main(String[] args) {
//		Resource r=new ClassPathResource("applicationContext.xml");  
//	    BeanFactory factory=new XmlBeanFactory(r); 
//		EmployeeDao dao=(EmployeeDao)factory.getBean("edao"); 
	    
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		// Thay đổi name="Nhung" tại id=1
		Employee e1=new Employee(1);
		e1.setStaff_name("Nhung");
		dao.saveorupdate(e1);

		//	Thêm dữ liệu
		Employee e2=new Employee();
		dao.saveorupdate(e2);
		
		System.out.println(dao.getEmployees());
	}  
     
    
}

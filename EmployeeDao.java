package com.javatpoint;
import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.*;  
public class EmployeeDao {
	private HibernateTemplate template;     
	
	public void saveorupdate(Employee e){  
		template.saveOrUpdate(e);
	}  
//	public void delete(Employee e){  
//		template.delete(e);
//	}  

	public List<Employee> getEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    list=template.loadAll(Employee.class);  
	    return list;  
	}  
}

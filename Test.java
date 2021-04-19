package com.javatpoint;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class Test {
	public static void main(String[] args) throws SQLException {
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
	    
//	    String sql = "INSERT INTO staff " + "VALUES (2, 'Nam', 'H122', '1999-07-27')";
//	    jdbcTemplate.update(sql);
	    
//	    String sql = "UPDATE staff SET staff_name = 'Cuong' WHERE staff_id = 2";
//	    jdbcTemplate.update(sql);
	    
//	    String sql = "delete from staff WHERE staff_id = 2";
//	    jdbcTemplate.update(sql);
   

	  }
}
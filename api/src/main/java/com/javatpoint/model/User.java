package com.javatpoint.model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "staff")
public class User {
@Id	
@Basic
@Column
private int staff_id;
private String staff_name;
private String staff_code;
private Date birth_day;
public int getStaff_id() {
	return staff_id;
}
public void setStaff_id(int staff_id) {
	this.staff_id = staff_id;
}
public String getStaff_name() {
	return staff_name;
}
public void setStaff_name(String staff_name) {
	this.staff_name = staff_name;
}
public String getStaff_code() {
	return staff_code;
}
public void setStaff_code(String staff_code) {
	this.staff_code = staff_code;
}
public Date getBirth_day() {
	return birth_day;
}
public void setBirth_day(Date birth_day) {
	this.birth_day = birth_day;
}
public User(int staff_id, String staff_name, String staff_code, Date birth_day) {
	
	this.staff_id = staff_id;
	this.staff_name = staff_name;
	this.staff_code = staff_code;
	this.birth_day = birth_day;
}
public User() {	
}


//private int id;
//private String name;
//private int salary;
//
//public User(int id, String name, int salary) {
//	this.id = id;
//	this.name = name;
//	this.salary = salary;
//}
//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public int getSalary() {
//	return salary;
//}
//public User() {
//	super();
//}
//public void setSalary(int salary) {
//	this.salary = salary;
//}


//cong giao tiep ip ngoai mysql la 3307 
//dung jpa danh dau can than vo nha

}

package com.javatpoint;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Employee {
	private long staff_id;
	private String staff_name;
	private String staff_code;
	private Date birth_day;
	
	public Employee() {}
	public Employee(long staff_id) {
		this.staff_id = staff_id;
    }
	public Employee(long staff_id, String staff_name, String staff_code, Date birth_day) {
		this.staff_id = staff_id;
		this.staff_name = staff_name;
        this.staff_code = staff_code;
        this.birth_day = birth_day;
    }
	@Id
	@Column(name = "staff_id")
	 public long getStaff_id() {
	        return staff_id;
	    }

	    public void setStaff_id(long staff_id) {
	        this.staff_id = staff_id;
	    }

	@Column(name = "staff_name")
	    public String getStaff_name() {
	        return staff_name;
	    }

	    public void setStaff_name(String staff_name) {
	        this.staff_name = staff_name;
	    }

	 @Column(name = "staff_code")
	    public String getStaff_code() {
	        return staff_code;
	    }

	    public void setStaff_code(String staff_code) {
	        this.staff_code = staff_code;
	    }

	 @Column(name = "birth_day")
	    public Date getBirth_day() {
	        return birth_day;
	    }
	 
	    public void setBirth_day(Date birth_day) {
	        this.birth_day = birth_day;
	    }
	    @Override
	    public String toString() {
	        return "Student [id=" + staff_id + ", Name=" + staff_name + ", code=" + staff_code + ", birth=" + birth_day + "]";
	    }

}
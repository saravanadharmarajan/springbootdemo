package com.spring.training.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name = "CITIZEN_AADHAR")  
public class CitizenAadhar   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column(name = "aadharid")  
private int aadharno;  
public int getAadharno() {
	return aadharno;
}
public void setAadharno(int aadharno) {
	this.aadharno = aadharno;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
//defining name as column name  
@Column(name = "citzen_name")   
private String name;  
//defining age as column name  
@Column(name = "citizen_dob")   
private String dob;  
//defining email as column name  
@Column(name = "citizen_email")   
private String email;  
public int getId()   
{  
return aadharno;  
}  
public void setId(int id)   
{  
this.aadharno = id;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  

public String getEmail()   
{  
return email;  
}  
public void setEmail(String email)   
{  
this.email = email;  
}  
}  

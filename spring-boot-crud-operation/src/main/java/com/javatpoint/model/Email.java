package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Email
{
//Defining email id as primary key

@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
private int emailid;
@Column
private String fromEmail;
@Column
private String toEmail;
public int getEmailid() {
	return emailid;
}
public void setEmailid(int emailid) {
	this.emailid = emailid;
}
public String getFromEmail() {
	return fromEmail;
}
public void setFromEmail(String fromEmail) {
	this.fromEmail = fromEmail;
}
public String getToEmail() {
	return toEmail;
}
public void setToEmail(String toEmail) {
	this.toEmail = toEmail;
}

}
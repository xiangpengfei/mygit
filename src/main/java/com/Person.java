package com;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="person")
public class Person {
  private String userName;
  private Date hiredate;
  private String gender;
  private List<String>color;
  private Map<String,Integer>info;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public List<String> getColor() {
	return color;
}
public void setColor(List<String> color) {
	this.color = color;
}
public Map<String, Integer> getInfo() {
	return info;
}
public void setInfo(Map<String, Integer> info) {
	this.info = info;
}
@Override
public String toString() {
	return "Person [userName=" + userName + ", hiredate=" + hiredate + ", gender=" + gender + ", color=" + color
			+ ", info=" + info + "]";
}

  
}

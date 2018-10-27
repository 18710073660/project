package com.gt.web.entity;

public class User {
	private Integer age;
	private String  name;
	private String  sex;
	
	
	public User(Integer age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	public User() {
		super();
	}
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}

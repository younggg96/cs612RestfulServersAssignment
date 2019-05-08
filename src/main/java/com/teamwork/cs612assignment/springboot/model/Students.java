package com.teamwork.cs612assignment.springboot.model;

import java.util.ArrayList;

public class Students {
	private int id;
    private String name;
    private int age;
    private ArrayList<Courses> courses;
	public Students(int id, String name, int age, ArrayList<Courses> courses) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.courses = courses;
	}
	public Students() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Courses> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Courses> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", courses=" + courses + "]";
	}
	
    
}

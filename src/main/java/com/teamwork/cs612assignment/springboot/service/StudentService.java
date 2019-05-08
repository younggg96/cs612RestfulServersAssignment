package com.teamwork.cs612assignment.springboot.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.teamwork.cs612assignment.springboot.model.Courses;
import com.teamwork.cs612assignment.springboot.model.Students;
import com.teamwork.cs612assignment.springboot.resources.JSONReader;

@Service
public class StudentService {
	ArrayList<Students> students = JSONReader.JsonToObj();

    public ArrayList<Students> retrieveAllStudents() {
		return students;
	}

	public Students retrieveStudent(int studentId) {
		for (Students student : students) {
			if (student.getId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public ArrayList<Courses> retrieveCourses(int studentId) {
		Students students = retrieveStudent(studentId);
		
		if (students == null) {
			return null;
		}

		return students.getCourses();
	}

	public Courses retrieveCourse(int studentId, int courseId) {
		Students students = retrieveStudent(studentId);

		if (students == null) {
			return null;
		}

		for (Courses course : students.getCourses()) {
			if (course.getId() == courseId) {
				return course;
			}
		}

		return null;
	}
}

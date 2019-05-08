package com.teamwork.cs612assignment.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.teamwork.cs612assignment.springboot.model.Courses;
import com.teamwork.cs612assignment.springboot.model.Students;
import com.teamwork.cs612assignment.springboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Students> retrieveAllStudents() {
		return studentService.retrieveAllStudents();
	}
	//retrieveAllStudents
	
	@GetMapping("/students/{studentId}/courses")
	public List<Courses> retrieveCoursesForStudent(@PathVariable int studentId) {
		return studentService.retrieveCourses(studentId);
	}
	
	@GetMapping("/students/{studentId}/courses/{courseId}")
	public Courses retrieveDetailsForCourse(@PathVariable int studentId,
			@PathVariable int courseId) {
		return studentService.retrieveCourse(studentId, courseId);
	}

}

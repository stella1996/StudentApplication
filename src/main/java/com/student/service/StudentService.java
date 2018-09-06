package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	public void register(Student s);
	public void login(Student s);
	public List<Student> listStudents();
	


}

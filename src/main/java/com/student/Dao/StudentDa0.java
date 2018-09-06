package com.student.Dao;

import java.util.List;

import com.student.model.Student;

public interface StudentDa0 {
	
	public void register(Student s);
	public void login(Student s);
	public List<Student> listStudents();
	

}

package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.Dao.StudentDa0;
import com.student.model.Student;
@Service
public class StudentServiceImpl implements StudentService{

	private StudentDa0 studentDa0;
	

	public void setStudentDa0(StudentDa0 studentDa0) {
		this.studentDa0 = studentDa0;
	}

	@Transactional
	public void register(Student s) {
		
		this.studentDa0.register(s);
		
	}

	public void login(Student s) {
		
	}

	public List<Student> listStudents() {
		return null;
	}

}

package com.student.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.student.model.Student;
@Repository
public class StudentDaoImpl implements StudentDa0 {
	
	private static final Logger logger= LoggerFactory.getLogger(StudentDaoImpl.class);
	
	private SessionFactory sessionFactory;
	 

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Student s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(s);
		logger.info("Registered Successfully");
	}

	public void login(Student s) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}

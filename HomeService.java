package com.cjc.Springboot.service;

import com.cjc.Springboot.model.Student;

public interface HomeService {

	   public void saveData(Student s);
		public Student loginCheck(String un,String ps);
		public Iterable<Student> getAllData();
		public void deleteData(Student s);
		public Student editData(int uid);
	}



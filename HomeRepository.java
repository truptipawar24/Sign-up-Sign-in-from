package com.cjc.Springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.Springboot.model.Student;


	@Repository
	public interface HomeRepository extends CrudRepository<Student, Integer> 
	{

		public Student findAllByUnameAndPassword(String un,String ps);
		public Student findAllByUid(int uid);
	}




package com.cjc.Springboot.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Springboot.model.Student;
import com.cjc.Springboot.repository.HomeRepository;
import com.cjc.Springboot.service.HomeService;

@Service
public class HomeServiceimp implements HomeService {
	
	@Autowired
	HomeRepository hr;

	public void saveData(Student s) 
	{
		hr.save(s);
		
	}

	@Override
	public Student loginCheck(String un, String ps) {
		
		return hr.findAllByUnameAndPassword(un,ps);
	}

	@Override
	public Iterable<Student> getAllData() {

		return hr.findAll();
	}

	@Override
	public void deleteData(Student s) {
		
		hr.delete(s);
		
	}

	@Override
	public Student editData(int uid) {
		
		return hr.findAllByUid(uid);
		
	}

	
	}







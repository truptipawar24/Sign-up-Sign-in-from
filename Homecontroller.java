package com.cjc.Springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.Springboot.model.Student;
import com.cjc.Springboot.service.HomeService;



@Controller
public class Homecontroller {
	
	
	
	
		@Autowired
		HomeService hs;
		
		
		@GetMapping("/")
		public String prelogin()
		{
			return "login";
		
		}
		@GetMapping("/registration")
		public String preregister()
		{
			return "register";
		}

		@GetMapping("/reg")
		public String regData(@ModelAttribute Student s)
		{
			hs.saveData(s);
			return "login";
		}

		@GetMapping("/login")
		public String loginCheck(@RequestParam("uname") String un,@RequestParam("password") String ps,Model m)
		{
			
			Student s=hs.loginCheck(un,ps);
			
			System.out.println(s.getName());
			
			Iterable<Student> list=hs.getAllData();
			m.addAttribute("data", list);
			
			return "success";
		}
		

		@GetMapping("/delete")
		public String deleteData(@ModelAttribute Student s,Model m)
		{
			hs.deleteData(s);
			
			Iterable<Student> list=hs.getAllData();
			m.addAttribute("data", list);
			return "success";
			
		}
		
		@GetMapping("/edit")
		public String editData(@RequestParam int uid,Model m)
		{
			Student s=hs.editData(uid);
			m.addAttribute("data",s);
			return "edit";
		}
		
		
		@GetMapping("/update")
		public String updateData(@ModelAttribute Student s, Model m)
		{
			hs.saveData(s);
			
			Iterable<Student> list=hs.getAllData();
			m.addAttribute("data", list);
			return "success";
			
		}
		


	}

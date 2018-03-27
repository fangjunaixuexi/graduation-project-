package com.fj.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fj.service.Iservice;
@Controller
@RequestMapping(value="/student")
public class StudentAction {

		@Autowired
		private Iservice service;
		
		@RequestMapping(value="tologin")
		public String tologin(){
			return "login";
		
}
}

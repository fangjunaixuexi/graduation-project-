package com.fj.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fj.model.User;
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
		
		@RequestMapping(value="toexamine")
		public String  examine(User user,HttpSession session) {
			User userSession=service.findUser(user);
			if(userSession!=null) {
				if(userSession.getUser_password().equals(user.getUser_password())) {
					session.setAttribute("userSession", userSession);
					return "Student_index";
				}else {
					return "login";
				}
			}
				return "login";
		}
		@RequestMapping(value="toright_index")
		public String toright_index(){
			return "right_index";
		}
}

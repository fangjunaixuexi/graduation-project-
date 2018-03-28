package com.fj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fj.mapper.Imapper;
import com.fj.model.User;

@Service
public class Iserviceimpl implements Iservice {
	@Autowired
	private Imapper mapper;

	//检查会员表中是否有登录的会员
	@Override
	public User findUser(User user) {
		
		return mapper.findUser(user);
	}

}

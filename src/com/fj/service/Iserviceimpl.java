package com.fj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fj.mapper.Imapper;
import com.fj.model.User;

@Service
public class Iserviceimpl implements Iservice {
	@Autowired
	private Imapper mapper;

	//����Ա�����Ƿ��е�¼�Ļ�Ա
	@Override
	public User findUser(User user) {
		
		return mapper.findUser(user);
	}

}

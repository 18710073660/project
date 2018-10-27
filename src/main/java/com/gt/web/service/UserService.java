package com.gt.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.web.dao.UserDao;
import com.gt.web.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userMapper;
	
	public List<User> getUserList(){
		System.out.println("UserService--getUserList()");
		return userMapper.getUserList();
	}
	

}

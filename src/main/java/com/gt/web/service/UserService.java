package com.gt.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.web.dao.UserDao;
import com.gt.web.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> getUserList(){
		return userDao.getUserList();
	}
	
	
	public User getUserById(String id){
		return userDao.getUserById(id);
	}

}

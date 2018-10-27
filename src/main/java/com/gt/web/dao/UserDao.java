package com.gt.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gt.web.entity.User;

@Mapper
public interface UserDao {
	
	public List<User> getUserList();
	
}

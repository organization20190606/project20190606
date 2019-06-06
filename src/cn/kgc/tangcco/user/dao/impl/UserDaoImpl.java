package cn.kgc.tangcco.user.dao.impl;

import cn.kgc.tangcco.user.dao.UserDao;
import cn.kgc.tangcco.user.entity.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User login(String username, String password) {
		System.out.println("登录方法实现");
		return null;
	}

}

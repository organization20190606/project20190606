package cn.kgc.tangcco.user.dao;

import cn.kgc.tangcco.user.entity.User;

public interface UserDao {
	User login(String username,String password);
}

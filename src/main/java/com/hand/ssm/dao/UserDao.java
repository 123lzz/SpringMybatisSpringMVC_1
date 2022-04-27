package com.hand.ssm.dao;

import com.hand.ssm.dto.User;

import java.util.List;

public interface UserDao {
    //按账号查找用户
    public User selectById(String id);
    //查找全部用户
    public List<User> selectAll();
    //	//按账号删除用户
//	public void deleteById(String id);
    //添加用户
    public void addUser(User user);
    //修改用户信息（密码、联系电话）
//	public void updateUser(User user);
    //登陆
    //public User DengLu(User user);
    //public User selectByIdAndPwd(String id, String pwd);
//	public User selectByIdAndPwd(User user);
}


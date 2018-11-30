package login.dao;

import java.sql.SQLException;

import login.entity.User;

/**
 * Title: UserDao.java
 * @date 2018年10月5日 下午3:24:55
 * @author Mr.yang  
 * 用户的DAO接口设计
 * 			|--- 接口是不可以被final修饰的哦！
 * 		|--- 登录
 * 		|--- 注册
 */
public interface UserDao {
	
	/**
	 * 用户登录（需要传入两个参数）
	 * @param username 用户名 
	 * @param password 密码
	 * @return	用户对象
	 * @throws SQLException 
	 */
	User login(String username, String password) throws SQLException;

	/**
	 * 用户注册（传入的是对象）
	 * @param user
	 * @return 整数
	 * @throws SQLException 
	 */
	int regist(User user) throws SQLException;
	
}

package login.service.impl;

import java.sql.SQLException;

import login.dao.UserDao;
import login.dao.impl.UserDaoImpl;
import login.entity.User;
import login.service.UserService;

/**
 * Title: UserServiceImpl.java
 * @date 2018年10月5日 下午4:17:34
 * @author Mr.yang  
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl(){
	    userDao = new UserDaoImpl();
    }
	
	@Override
	public User userLogin(String username, String password) {
		
		try {
			User user = userDao.login(username, password);
			return user;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public int userRegister(User user) {
		try {
			return userDao.regist(user);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

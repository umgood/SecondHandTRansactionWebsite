package login.dao.impl;

import java.sql.SQLException;

import login.dao.UserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import login.dao.UserDao;
import login.entity.User;
import login.util.DBCPUtils;

/**
 * Title: UserDaoImpl.java
 * 用户的DAO实现类的设计
 * @date 2018年10月5日 下午3:28:33
 * @author Mr.yang 采用[数据源连接池 - DBCP] 使用Dbutils工具类中的QueryRunner进行
 */
public class UserDaoImpl implements UserDao {

	QueryRunner queryRunner;

	public UserDaoImpl(){
	    DBCPUtils dbcpUtils = new DBCPUtils();
	    queryRunner = new QueryRunner(dbcpUtils.getDataSource());
    }

	@Override
	public User login(String username, String password) throws SQLException {
		return queryRunner.query(
				"select * from user where username = ? and password = ?", //
				new BeanHandler<User>(User.class), username, password);
	}


    @Override
    public int regist(User user) throws SQLException {
        int a = queryRunner.update("insert into user(username,password,sex,email)values(?,?,?,?)",
                user.getUsername(),
                user.getPassword(),
                user.getSex(),
                user.getEmail()
        );
        return a;

    }
}

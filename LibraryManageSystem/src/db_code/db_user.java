package db_code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import component_code.User;

public class db_user {

	//登陆验证核心
	public User login(Connection con, User user)throws Exception{
		User resultUser=null;
		String sql="select * from t_user where username=? and password=?";
		PreparedStatement pstmt=con.prepareStatement(sql); //多次执行性能比statement要好，但第一次开销最大
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		ResultSet rs=pstmt.executeQuery(); //查询，获取结果集
		if(rs.next()){
			//rs.next()返回true表示rs不空，且从下标-1移至0，开始实例化
			resultUser=new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUsername(rs.getString("username"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}
}

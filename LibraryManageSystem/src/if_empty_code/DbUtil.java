package if_empty_code;


import java.sql.Connection;
import java.sql.DriverManager;

/** 数据库工具类
 * @author Administrator
 */

public class DbUtil {
	//连接数据库
	private String url="jdbc:mysql://localhost:3306/library";
	private String username="root";
	private String password="root";
	private String jdbcName="com.mysql.jdbc.Driver"; //要添加进lib内
	
	public Connection getCon()throws Exception{
		//获取数据库连接
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(url, username, password);
		return con;
	}

	/**
	 * 关闭数据库链接
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		//不加if会空指针异常，con有开销所以一定要关闭
		if(con!=null){
			con.close();
		}
	}


	public static void main(String[] args) {
		//用于单独测试，真正运行程序的时候不走这里
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("成功连接！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败！");
		}
	}
	
}
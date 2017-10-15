package if_empty_code;


import java.sql.Connection;
import java.sql.DriverManager;



public class DbUtil {

	private String Url="jdbc:mysql://localhost:3306/library";
	private String UserName="root"; 
	private String Password="root"; 
	private String jdbcName="com.mysql.jdbc.Driver";
	
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(Url, UserName, Password);
		return con;
	}
	
	
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
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

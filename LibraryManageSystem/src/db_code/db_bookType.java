package db_code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import component_code.BookType;
import if_empty_code.enter;

public class db_bookType{


    public int add(Connection con, BookType bookType)throws Exception{
        String sql="insert into t_bookType values(null,?,?)";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, bookType.getBookTypeName());
        pstmt.setString(2, bookType.getBookTypeDesc());
        return pstmt.executeUpdate();
    }


    public ResultSet list(Connection con,BookType bookType)throws Exception{
        StringBuffer sb=new StringBuffer("select * from t_bookType");
        if(enter.isNotEmpty(bookType.getBookTypeName())){
            sb.append(" and bookTypeName like '%"+bookType.getBookTypeName()+"%'");
        }
        //链接组合成sql语句---e.g.--select * from t_bookType where bookTypeName like '%文学%'
        PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();
    }


    public int delete(Connection con,String id)throws Exception{
        String sql="delete from t_bookType where id=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, id);
        return pstmt.executeUpdate();
    }


    public int update(Connection con,BookType bookType)throws Exception{
        String sql="update t_bookType set bookTypeName=?,bookTypeDesc=? where id=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, bookType.getBookTypeName());
        pstmt.setString(2, bookType.getBookTypeDesc());
        pstmt.setInt(3, bookType.getId());
        return pstmt.executeUpdate();
    }


}


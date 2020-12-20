package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import tools.JDbcUtil;

public class BorrowDao {
	public boolean borrow(String BookID,String BookName,String userName,String chaName,String borrowtime,String returntime){
		boolean success = false;
		
		JDbcUtil dbc = new JDbcUtil();
		Connection con = dbc.getConnection();
		
		
		try{
			//3.创建语句
			String sql= "insert into brh(BookID,BookName,userName,chaName,borrowtime,returntime)";
			sql += " values(?,?,?,?,?,?)";

			java.sql.PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, BookID);
			pst.setString(2,BookName);
			pst.setString(3, userName);
			pst.setString(4,chaName);
			pst.setString(5, borrowtime);
			pst.setString(6,returntime);
			
			//4，执行语句
			int i = pst.executeUpdate();
			
			//5，结果处理
			if(i>0){
				success = true;
			}
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6.关闭连接
			dbc.close();
		}
		
		
		return success;
	} 
	
	public boolean bookcheck(String BookID){
		boolean success = false;
		
		JDbcUtil dbc = new JDbcUtil();
		Connection con = dbc.getConnection();
		
		
		try{
			//3.创建语句
			String sql= "select from brh where BookID=?)";

			java.sql.PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, BookID);	
			//4，执行语句
			int i = pst.executeUpdate();
			
			//5，结果处理
			if(i>0){
				success = true;
			}
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6.关闭连接
			dbc.close();
		}
		
		
		return success;
	} 

}

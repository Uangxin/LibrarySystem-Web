package dao;

import tools.JDbcUtil;
import vo.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDao {
//	public ArrayList<Book> queryBook(){
//		ArrayList<Book> list=new ArrayList<Book>();
//		JDbcUtil dbc = new JDbcUtil();
//		Connection con = dbc.getConnection();
//		try {
//
//			// 3.创建语句
//			String sql = "select * from book ";
//			PreparedStatement pst = con.prepareStatement(sql);
//			// 4.执行语句
//			ResultSet rs = pst.executeQuery();
//			// 5.结果处理
//			while (rs.next()) {
//				Book book = new Book(rs.getString("bookID"), 
//						rs.getString("bookName"),
//						rs.getString("bookCategory"), 
//						rs.getString("bookIntroduction"));
//
//				list.add(book); // 将对象存放于集合中
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// 6.关闭连接
//			dbc.close();
//		}
//		
//		return list;
//	}
	
	public  Book get(String bookName){
		
		Book book = null;
		JDbcUtil dbc = new JDbcUtil();
		Connection con = dbc.getConnection();
		try {

			// 3.创建语句
			String sql = "select * from book where bookName=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, bookName);
			// 4.执行语句
			ResultSet rs = pst.executeQuery();
			// 5.结果处理
			if(rs.next()) {
				book = new Book(rs.getString("bookID"), 
						rs.getString("bookName"),
						rs.getString("bookCategory"), 
						rs.getString("bookIntroduction"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接
			dbc.close();
		}
		
		return book;
	}
}

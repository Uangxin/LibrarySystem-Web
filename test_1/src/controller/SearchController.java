package controller;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.Book;
import dao.BookDao;

@WebServlet(urlPatterns ="/searchtext.do")
public class SearchController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		//获取表中的数据
		String searchtext = request.getParameter("searchtext");
		HttpSession session = request.getSession();
		String forwardPath = "";

		
		if(searchtext==null){
			request.setAttribute("info", "关键词为空！");
			request.setAttribute("path", "search.jsp");
			forwardPath = "/search.jsp";
		}
		else{//验证码正确
			BookDao bookDao = new BookDao();
			Book  book = bookDao.get(searchtext);
			if(book == null){//书籍不存在！
				request.setAttribute("info", "搜索书籍不存在！");
				request.setAttribute("path", "search.jsp");
				forwardPath="search.jsp";
			}
			else{
			
					session.setAttribute("currentBook", book);
					forwardPath="/searchResult.jsp";
				}
				
			}
		RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
		// 将请求转发到目标程序
		rd.forward(request, response);
		
	}

	
	

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BorrowDao;
import dao.UserDao;
import vo.Book;
import vo.User;

@WebServlet(urlPatterns ="/borrowbook.do")
public class BorrowController extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String borrowbookID = request.getParameter("borrowbookID");
		String borrowbookName = request.getParameter("borrowbookName");
		String borrowuserName = request.getParameter("borrowuserName");
		String borrowchaName = request.getParameter("borrowchaName");
		String borrowtime = request.getParameter("borrowtime");
		String returntime = request.getParameter("returntime");
		
		//HttpSession session = request.getSession();
		String forwardPath = "";
		
		//User user =  (User) request.getSession().getAttribute("userName");
		//Book book =  (Book) request.getSession().getAttribute("bookName");
		if(borrowbookName!=null){
			if(borrowbookID!=null){
				BorrowDao borrowDao = new BorrowDao();
				boolean flag =borrowDao.borrow(borrowbookID,
						borrowbookName,
						borrowuserName,
						borrowchaName,
						borrowtime,
						returntime);
				if(flag==true){
					request.setAttribute("info", "ΩË È≥…π¶!");
					request.setAttribute("path", "searchResult.jsp");
					forwardPath = "searchResult.jsp";
				}
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
		rd.forward(request,response);
	}

}

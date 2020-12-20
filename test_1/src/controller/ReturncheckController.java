package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Book;
import dao.BorrowDao;

@WebServlet(urlPatterns ="/returncheck.do")
public class ReturncheckController extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		request.setCharacterEncoding("utf-8");
		
		String borrowbookID = request.getParameter("borrowbookID");
		//HttpSession session = request.getSession();
		String forwardPath = "";
		
		//Book book =  (Book) request.getSession().getAttribute("currentBook");
		if(borrowbookID!=null){
			if(borrowbookID!=null){
				BorrowDao borrowDao = new BorrowDao();
				boolean flag =borrowDao.bookcheck(borrowbookID);
				if(flag==true){
//					request.setAttribute("info", "ΩË È≥…π¶!");
//					request.setAttribute("path", "searchResult.jsp");
					forwardPath = "returnbook.jsp";
				}
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
		rd.forward(request,response);
	}

}

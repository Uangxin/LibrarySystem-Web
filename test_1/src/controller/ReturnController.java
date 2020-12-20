package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BorrowDao;
import dao.ReturnDao;

@WebServlet(urlPatterns ="/returnbook.do")
public class ReturnController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String returnbookID = request.getParameter("borrowbookID");
		String returnuserName = request.getParameter("userName");
		
	
		String forwardPath = "";
		
		if(returnbookID!=null){
			if(returnuserName!=null){
				ReturnDao returnDao = new ReturnDao();
				boolean flag =returnDao.returnbook(returnbookID,returnuserName);
				if(flag==true){
					request.setAttribute("info", "还书成功!");
					request.setAttribute("path", "returnbook.jsp");
					forwardPath = "returnbook.jsp";
				}
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
		rd.forward(request,response);
	}


}

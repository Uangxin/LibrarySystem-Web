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

import vo.User;
import dao.UserDao;

@WebServlet(urlPatterns ="/changepassword.do")
public class ChangePasswordController extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("userName");
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		HttpSession session = request.getSession();
		String forwardPath = "";
		//HttpSession session = request.getSession();
		//User user =  (User) request.getSession().getAttribute("userName");
		
		if(oldpassword.equals(newpassword)){
			request.setAttribute("info", "新旧密码相同，不能修改");
			request.setAttribute("path", "ChangePassword.jsp");
			forwardPath = "ChangePassword.jsp";
		}
		else{
			UserDao userDao = new UserDao();
			boolean flag =userDao.changepassword(newpassword,userName);
			if(flag==true){
				request.setAttribute("info", "修改成功!");
				request.setAttribute("path", "ChangePassword.jsp");
				forwardPath = "ChangePassword.jsp";
			}
			else{
				request.setAttribute("info", "修改失败，请重试!");
				request.setAttribute("path", "ChangePassword.jsp");
				forwardPath = "ChangePassword.jsp";
			}
		}		
		RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
		rd.forward(request,response);
		
	}
}

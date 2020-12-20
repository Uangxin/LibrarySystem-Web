package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import vo.User;

public class PermissionFilter implements Filter {
	
	private String notCheckPath;//不需要过滤额请求地址，从web.xml文件中读取
	
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
		String path = request.getServletPath();
		
		
		System.out.println("请求地址url-pattern:"+path);
		
		if(notCheckPath.indexOf(path) == -1){
			HttpSession session = request.getSession();
			if(session.getAttribute("currentUse") == null){
				request.setAttribute("info", "没有权限访问");
				request.getRequestDispatcher("/error.jsp").forward(request, 
						resp);
				
			}
			else {//已经登录，直接放行
				
				String value=null;
				Boolean flag=false;
				Cookie[] cookie=request.getCookies();
				for(Cookie a:cookie){
					if(a.getName().equals("username")){
						flag=true;
						value=a.getValue();
						break;
					}
				}
				System.out.println(value);
				if(flag){
					
					User user=null;
					try {
						//user=dao.getUser(value);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(user);
					session.removeAttribute("currentUser");
					String chr=user.getChrName();
					session.setAttribute("currentUser", chr);
				}
				else{
					request.setAttribute("info", "没有权限访问");
					request.getRequestDispatcher("/error.jsp").forward(request, resp);
				}
				
				chain.doFilter(req, resp);
			}
		}
		else{//地址不需要过滤的，直接放行
			chain.doFilter(req, resp);
		}
		
		

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// 从web.xml配置文件中的filter中读取名为notCheckPath的初始值
		notCheckPath = config.getInitParameter("notCheckPath");

	}

}

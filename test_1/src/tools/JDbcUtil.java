package tools;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDbcUtil {
	// 数据库参数配置文件名
		private static final String JDBCPROPERTY = "jdbc.properties";
		// 准备数据库的四大参数：
		private static String DBDRIVER = "";
		private static String DBURL = "";
		private static String DBUSER = "";
		private static String PASSWORD = "";

		private Connection conn; // 准备出一个数据库连接对象

		/**
		 * 使用静态静态代码快加载数据库配置文件 静态代码块，在虚拟机加载类的时候就会加载执行，而且只执行一次;
		 * 非静态代码块，在创建对象的时候(即new一个对象的时候)执行，每次创建对象都会执行一次
		 */
		static {
			try {
				Properties property = new Properties();
				//使用类加载器加载资源,path 不以’/'开头时默认是从此类所在的包下取资源，以’/'开头则是从ClassPath根下获取
				System.out.println("|"+DBDRIVER+"|"+DBURL+"|"+DBUSER+"|"+PASSWORD);
				InputStream is = JDbcUtil.class.getResourceAsStream("/resources/jdbc.properties");
				property.load(new InputStreamReader(is, "utf-8"));
				is.close();
				DBDRIVER = property.getProperty("DBDRIVER");
				DBURL = property.getProperty("DBURL");
				DBUSER = property.getProperty("DBUSER");
				PASSWORD = property.getProperty("PASSWORD");
				// 加载驱动，只需注册一次就行
				Class.forName(DBDRIVER);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public JDbcUtil() {
			try {
				System.out.println("|"+DBURL+"|"+DBUSER+"|"+PASSWORD+"|");
				this.conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public Connection getConnection() {
			return this.conn;
		}

		public void close() {
			if (this.conn != null) {
				try {
					this.conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}
	

}

package cn.edu.scau.cmi.zhouxudong.util;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  

public class DBConn {
  
	private static final String url = "jdbc:mysql://localhost:3306/library";       //���ݿ��ַ  
    private static final String username = "root";      //���ݿ��û���  
    private static final String password = "123456";        //���ݿ�����  
    private static final String driver = "com.mysql.jdbc.Driver";       //mysql����  
    private static final Connection conn = null;  
      
    /** 
     * �������ݿ� 
     * @return 
     */  
    public static Connection conn() {  
        Connection conn = null;  
        try {  
            Class.forName(driver);  //�������ݿ�����  
            try {  
                conn = DriverManager.getConnection(url, username, password);  //�������ݿ�  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        }  
        return conn;  
    }  
      
    /** 
     * �ر����ݿ����� 
     * @return 
     */  
    public static void close() {  
        if(conn != null) {  
            try {  
                conn.close();  //�ر����ݿ�����  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  


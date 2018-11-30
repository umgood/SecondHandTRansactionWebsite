package Publish;
import java.sql.*;
public class BaseDao {
    private static String driver="com.mysql.cj.jdbc.Driver\"";
    private static String url="jdbc:mysql://localhost:3306/fuck?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    private static String user="root";
    private static String password="root";
        static {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);    
    }
    
    public static void closeAll(Connection conn,Statement stmt,ResultSet rs) throws SQLException {
        if(rs!=null) {
            rs.close();
        }
        if(stmt!=null) {
            stmt.close();
        }
        if(conn!=null) {
            conn.close();
        }
    }
    
}
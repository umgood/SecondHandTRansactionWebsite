package Publish;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseAccess
 */
@WebServlet("/DatabaseAccess")
public class SellGoodsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    final String DB_URL = "jdbc:mysql://localhost:3306/system?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
    final String USER = "root";
    final String PASS = "fcncdn";
    
    public SellGoodsServlet() {
        super();
        
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("SellGoodsServlet - doGet: start" );
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            response.setContentType("text/html;charset=UTF-8");

            //session 获取用户ID
            String sellerId = request.getSession().getAttribute("user").toString();
            System.out.println("SellGoodsServlet - doGet: seller," + sellerId);
            //PrintWriter out = response.getWriter();
             String goodName =request.getParameter("name");
             String price = request.getParameter("price");
            String sql;
            sql = "insert into items(item_name, item_price, seller_id) values ('"+ goodName +"',"+ price +",'"+ sellerId +"');";
           boolean rs = stmt.execute(sql);
            response.sendRedirect(request.getContextPath() + "/main.jsp");
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            // ���� JDBC ����
            se.printStackTrace();
        } catch(Exception e) {
            // ���� Class.forName ����
            e.printStackTrace();
        }finally{
            // ��������ڹر���Դ�Ŀ�
            try{
                if(stmt!=null)
                stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
       
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
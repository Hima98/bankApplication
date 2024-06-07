import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;





//package java_mysql_database_connection;

/**
 *
 * @author HP
 */
public class DBF {
    public static Connection c;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/life_bank";
            String un="root";
            String pw="1234";
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/life_bank?useSSL=false",un,pw);
                    
                
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    public static void iud(String query) throws Exception{
   
    Statement s= c.createStatement();
    s.executeUpdate(query);
       
}
    public static ResultSet  search(String query) throws Exception{
        Statement s= c.createStatement();
        ResultSet rs= s.executeQuery(query);
        return rs;
    }
}

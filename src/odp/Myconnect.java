
package odp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Personal
 */
public class Myconnect {
    
    static Connection cn;
    public static Connection ConnectedDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/myuserdatabase","root","");
            System.out.println("Connected!");
            return cn;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    
}
}

package mart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;

public class cart {
	public static double sum;
	public void bill() {
		
		
	
	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
       
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
        Statement statement=connection.createStatement();
        
       
         
         ResultSet rs=statement.executeQuery("SELECT * FROM store.cart");
         System.out.println("id"+"\t"+"name"+"\t"+"quantity"+"\t"+"price"+"\t"+"discription");
         while (rs.next()) {
        	 
        	 System.out.println(rs.getInt(1)+"\t	"+rs.getString(2)+"\t	"+rs.getDouble(3)+"	\t"+rs.getDouble(4)+"\t"+rs.getString(5));
			sum+=rs.getDouble(4);
		}
       		
      
        
    } catch (Exception e) {
        System.out.println(e);



   }
	System.out.println("total bill="+sum);
	

}
}

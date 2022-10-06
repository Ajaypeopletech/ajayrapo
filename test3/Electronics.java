package mart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Electronics {
	public static int id1;
	public static double price, quantity,sum;
	public static String name, discription;
	Scanner scanner=new Scanner(System.in);
	Connection connection;
	
	public void display() {
		try {
			  Connection connection;
		        
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
	          
	            Statement statement=connection.createStatement();
	            
	            ResultSet rs=statement.executeQuery("SELECT * FROM store.elctronics ");
	            System.out.println("id"+"\t"+"name"+"\t"+"quantity"+"\t"+"price"+"\t"+"discription");
	            while(rs.next())
	            {
	            	
	            	System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+" \t"+rs.getDouble(3)+"\t "+rs.getDouble(4)+" \t"+rs.getString(5));
	            
	            }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void bookelctronics() {
		try {
			System.out.println("please select product for that enter id of product");
			int id=scanner.nextInt();
			System.out.println("please enter quantity");
			quantity=scanner.nextDouble();
			  Connection connection;
		        
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
	           
	            Statement statement=connection.createStatement();
	          
	            ResultSet re=statement.executeQuery("SELECT * FROM store.elctronics where id='"+id+"'");
	           
	            while(re.next())
	            {
	            System.out.println("1");
	            	double  a=re.getDouble(4);
	            	price=quantity*a;
	            	discription=re.getString(5);
	            	name=re.getString(2);
	            	id1=re.getInt(1);
	            
	            	cart1();
	            	System.out.println("if want to continue this section press 1\n2 for next section");
	            	int z=scanner.nextInt();
	            	if (z==1) {
	            		display();
	            		bookelctronics();
						
					}
	            	else {
	            		Main main=new Main();
	            		main.bookproducts();
	            		
	            	}
	            	
	            	
	            
	            
	            }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public void cart1() {
		

			try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		       
		        
		        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
		        Statement statement=connection.createStatement();
		        System.out.println("1");
		        String query="INSERT INTO `store`.`cart` (`id`, `name`, `quantity`, `price`, `discription`) VALUES ('"+id1+"', '"+name+"', '"+quantity+"', '"+price+"','"+discription+"')";
		         statement.executeUpdate(query);
		         ResultSet rs=statement.executeQuery("SELECT * FROM store.cart");
		         System.out.println("id"+"\t"+"name"+"\t"+"quantity"+"\t"+"price"+"\t"+"discription");
		         while (rs.next()) {
		        	 
		        	 System.out.println(rs.getInt(1)+"\t	"+rs.getString(2)+"\t	"+rs.getDouble(3)+"	\t"+rs.getDouble(4)+"\t"+rs.getString(5));
					
				}
		       		
		      
		        
		    } catch (Exception e) {
		        System.out.println(e);



		   }
		
	}
	
}

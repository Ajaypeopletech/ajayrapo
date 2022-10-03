package test2.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
	public static double sum ,budget;
	
	Scanner scanner=new Scanner(System.in);
	
  public void book () 
	
{
	  System.out.println("please enter budget");
	  budget=scanner.nextDouble();
	  Seller seller= new Seller();
	  System.out.println("1 for elctronocs\n2 for bath\n3 for kitchen\n4 for cloths \n5 for otheritems\n6 for bill  ");
	  int z=scanner.nextInt();
	  if (z==1) {
		
	
	ArrayList<Details> cat=seller.elctronics();
	for (Details d : cat) {
		System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getQuantity()+"\t"+d.getPrice());
		System.out.println("please enter id for product");
	
		int a=scanner.nextInt();
		if (d.getId()==a) {
			System.out.println("enter required quantity");
			int b= scanner.nextInt();
			double c=b*d.getPrice();
			sum+=c;
			
			if (sum>=budget) {
				System.out.println("your bill is geter than budject");
				System.out.println(sum);
				sum=0;
				System.out.println("please start from starting");
				Main.book1();
				
			}
			else {
				Main.book1();
			}
		}
		}
	}
	  else if (z==2) {
			
			
			ArrayList<Details> cat=seller.bath();
			for (Details d : cat) {
				System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getQuantity()+"\t"+d.getPrice());
				System.out.println("please enter id for product");
			
				int a=scanner.nextInt();
				if (d.getId()==a) {
					System.out.println("enter required quantity");
					int b= scanner.nextInt();
					double c=b*d.getPrice();
					sum+=c;
					
					if (sum>=budget) {
						System.out.println("your bill is geter than budject");
						System.out.println(sum);
						sum=0;
						System.out.println("please start from starting");
						Main.book1();
						
					}
					else {
						Main.book1();
					}
					
					
				}
				}
			}
	  else if (z==3) {
			
			
			ArrayList<Details> cat=seller.kitchen();
			for (Details d : cat) {
				System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getQuantity()+"\t"+d.getPrice());
				System.out.println("please enter id for product");
			
				int a=scanner.nextInt();
				if (d.getId()==a) {
					System.out.println("enter required quantity");
					int b= scanner.nextInt();
					double c=b*d.getPrice();
					sum+=c;
					
					if (sum>=budget) {
						System.out.println("your bill is geter than budject");
						System.out.println(sum);
						sum=0;
						System.out.println("please start from starting");
						Main.book1();
						
					}
					else {
						Main.book1();
					}
				}
				}
			}
	  else  if (z==4) {
			
			
			ArrayList<Details> cat=seller.cloths();
			for (Details d : cat) {
				System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getQuantity()+"\t"+d.getPrice());
				System.out.println("please enter id for product");
			
				int a=scanner.nextInt();
				if (d.getId()==a) {
					System.out.println("enter required quantity");
					int b= scanner.nextInt();
					double c=b*d.getPrice();
					sum+=c;
					
					if (sum>=budget) {
						System.out.println("your bill is geter than budject");
						System.out.println(sum);
						sum=0;
						System.out.println("please start from starting");
						Main.book1();
						
					}
					else {
						Main.book1();
					}
					
				}
				}
			}
	  else if (z==5) {
			
			
			ArrayList<Details> cat=seller.others();
			for (Details d : cat) {
				System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getQuantity()+"\t"+d.getPrice());
				System.out.println("please enter id for product");
			
				int a=scanner.nextInt();
				if (d.getId()==a) {
					System.out.println("enter required quantity");
					int b= scanner.nextInt();
					
					double c=b*d.getPrice();
					sum+=c;
					
					if (sum>=budget) {
						System.out.println("your bill is geter than budject");
						System.out.println(sum);
						sum=0;
						System.out.println("please start from starting");
						Main.book1();
						
					}
					else {
						Main.book1();
					}
					
				}
				}
			}
	  
}
  public void bill() {
	  System.out.println(sum);
	  sum=0;
	
}
}

package test2.com;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Seller seller = new Seller();
		seller.elctronics();
		seller.bath();
		seller.cloths();
		seller.kitchen();
		seller.others();
		Main.book1();
		
	}
	public static void book1() {
		Booking booking= new Booking();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 for booking for products\n2 for exit\n3 for enter next section");
		int a=scanner.nextInt();
		
		if (a==1) {
			booking.book();
			Main.book1();
			
			
		}
		else if (a==2) {
			booking.bill();
			System.out.println("thank you for booking");
			
		}
		else if (a==3) {
			booking.book();
			Main.book1();
			
		}
		
		
	}

}

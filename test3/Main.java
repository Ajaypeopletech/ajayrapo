package mart;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Main {
	public static void main(String[] args) {
		Main main =new Main();
		main.bookproducts();
		System.out.println();
		
		
	
	}
	public  void bookproducts() {
		System.out.println("1 for elctronics\n2 for kitchen\n3 for bath\n4 for clothes\n5 for bill");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		if (a==1) {
			Electronics electronics =new Electronics();
			electronics.display();
			electronics.bookelctronics();
			
			
		}
		else if (a==2) {
			Kitchen kitchen=new Kitchen();
			kitchen.display();
			kitchen.bookkichen();
			
		}
		else if (a==3) {

          Bath bath=new Bath();
          bath.diplay();
          bath.book2();
          
			
		}
		else if (a==4) {
			Clothes clothes =new Clothes();
			clothes.display();
			clothes.bookelcloths();
			
		}
		else if (a==5) {
			cart cart=new cart();
			cart.bill();
			
		}
	}

}

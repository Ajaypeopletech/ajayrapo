package test2.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seller {
	
	Scanner scanner = new Scanner(System.in);
	//ArrayList<Details> arr1=new ArrayList<>();
	public  ArrayList<Details> elctronics() {
		Details details=new Details();
		ArrayList<Details> arr1=new ArrayList<>();
		System.out.println("please enter electronics details");
		System.out.println("please enter no.of item need to add");
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			
		
		
		System.out.println("please enter id");
	  details.setId(scanner.nextInt());
		System.out.println("please enter nmae of product");
		details.setName(scanner.next());
		System.out.println("please enter availability");
		details.setQuantity(scanner.nextDouble());
		System.out.println("please enter price/item");
		details.setPrice(scanner.nextDouble());
		arr1.add(details);
		}
		return arr1;
	}
	public ArrayList<Details> bath() {
		Details d=new Details();
		System.out.println("please enter bath item details");
		ArrayList<Details> arr2=new ArrayList<>();
		System.out.println("please enter no.of item need to add");
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			
		
		
		System.out.println("please enter id");
	  d.setId(scanner.nextInt());
		System.out.println("please enter nmae of product");
		d.setName(scanner.next());
		System.out.println("please enter availability");
		d.setQuantity(scanner.nextDouble());
		System.out.println("please enter price/item");
		d.setPrice(scanner.nextDouble());
		arr2.add(d);
		
		
		}
	return arr2;
	}
	public ArrayList<Details> kitchen() {
		Details d2=new Details();
		System.out.println("please enetr kitchen item details ");
		ArrayList<Details> arr3=new ArrayList<>();
		System.out.println("please enter no.of item need to add");
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			
		
		
		System.out.println("please enter id");
	  d2.setId(scanner.nextInt());
		System.out.println("please enter nmae of product");
		d2.setName(scanner.next());
		System.out.println("please enter availability");
		d2.setQuantity(scanner.nextDouble());
		System.out.println("please enter price/item");
		d2.setPrice(scanner.nextDouble());
		arr3.add(d2);
		
		
		}
		return arr3;
		
		
	}
	public ArrayList<Details> cloths() {
		Details d3=new Details();
		System.out.println("please enter cloth details");
		ArrayList<Details> arr4=new ArrayList<>();
		System.out.println("please enter cloth details");
		System.out.println("please enter no.of item need to add");
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			
		
		
		System.out.println("please enter id");
	  d3.setId(scanner.nextInt());
		System.out.println("please enter nmae of product");
		d3.setName(scanner.next());
		System.out.println("please enter availability");
		d3.setQuantity(scanner.nextDouble());
		System.out.println("please enter price/item");
		d3.setPrice(scanner.nextDouble());
		arr4.add(d3);
		
		
		}
		return arr4;
		
	}
	public ArrayList<Details> others() {
		Details d4=new Details();
		System.out.println("please enter other details");
		ArrayList<Details> arr5=new ArrayList<>();
		System.out.println("please enter no.of item need to add");
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			
		
		
		System.out.println("please enter id");
	  d4.setId(scanner.nextInt());
		System.out.println("please enter nmae of product");
		d4.setName(scanner.next());
		System.out.println("please enter availability");
		d4.setQuantity(scanner.nextDouble());
		System.out.println("please enter price/item");
		d4.setPrice(scanner.nextDouble());
		arr5.add(d4);
		
		
		}
		return arr5;
	}
	
		
	
//	private void disply( ) {
//		System.out.println("kk");
//		int a=  scanner.nextInt();
//				if (a==1) {
//					
//				
//		for (Details details1 : arr1) {
//			System.out.println(details1.getId());
//			
//		}
//				}
//				else if (a==2) {
//					
//				
//		for (Details details2 : arr1) {
//			System.out.println(details2.getId());
//		}
//				}
//
//		
//		
//	}
	

}

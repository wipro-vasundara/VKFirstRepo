package middleTableProject;

import java.util.Scanner;

public class ScanItem {
	
	Scanner sc = new Scanner(System.in);
	
	public void ScanItem(){
		System.out.println("Please enter item ID");
		int item_ID = Integer.parseInt(sc.nextLine());
				
		System.out.println("Please enter item name");
		String item_Name = sc.nextLine();
		
		System.out.println("Please enter quantity of item in stock");
		int item_stock = Integer.parseInt(sc.nextLine());
		
		System.out.println("Please enter RRP for item");
		double item_price = Double.parseDouble(sc.nextLine());
	}
	
	public void ScanCustomer(){
		System.out.println("Please enter item ID");
		String Customer_Number = sc.nextLine();
				
		System.out.println("Please enter item name");
		String Customer_Name = sc.nextLine();
		
		System.out.println("Please enter quantity of item in stock");
		String Customer_Address = sc.nextLine();
		
		System.out.println("Please enter price for item");
		String Customer_Postcode= sc.nextLine();
	}
	
}

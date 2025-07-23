package Assignment2;
import java.util.Scanner;

public class Commission {

			String Name, Address;
			String Phone;
			double Sales_amount;
			
			public Commission()//default constructor call
			{
				System.out.println("Student object is created!");
			}
			
			public void details()//getting details of employee
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the name: ");
				Name = sc.nextLine();
				System.out.println("Enter the address: ");
				Address = sc.nextLine();
				System.out.println("Enter the phone: ");
				Phone = sc.nextLine();
				System.out.println("Enter the amount: ");
				Sales_amount = sc.nextDouble();
				System.out.println(" ");
				sc.close();
			}
			
			public void calculate()
			{
				double commission;
				
				if (Sales_amount >= 100000)
				{
					commission = Sales_amount * 0.10 ;
				}
				
				else if (Sales_amount >= 50000 && Sales_amount < 100000)
				{
					commission = Sales_amount * 0.05 ;
				}
				
				else if (Sales_amount >= 30000 && Sales_amount < 50000)
				{
					commission = Sales_amount * 0.03 ;
				}
				
				else
				{
					commission = Sales_amount ;
				}
				
				System.out.println("Name: " + Name);
				System.out.println("Address: "+ Address);
				System.out.println("Phone number: "+ Phone);
				System.out.println("Sales_amount: " + Sales_amount);
				System.out.println("Commission: " + commission);
			}
			
			
		}
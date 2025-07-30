package Assignment4;
import java.util.Scanner;

public class Executor {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 double costperhour = 120;
		    System.out.println("Select Airline:");
	        System.out.println("1. Air India");
	        System.out.println("2. KingFisher");
	        System.out.println("3. Indigo");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        
	        System.out.print("Enter hours of flight: ");
	        int hours = sc.nextInt();
	        
	        System.out.println("Cost Per Hour is: "+costperhour);
	        
	        Airfare flight;
	        switch (choice) {
	            case 1:
	                flight = new AirIndia(hours, costperhour);
	                break;
	            case 2:
	                flight = new KingFisher(hours, costperhour);
	                break;
	            case 3:
	                flight = new Indigo(hours, costperhour);
	                break;
	            default:
	                System.out.println("Invalid choice");
	                sc.close();
	                return;
	        }
	        System.out.println("Your Flight Fare Amount is:");
	        flight.display();
	        sc.close();
	 }

	}
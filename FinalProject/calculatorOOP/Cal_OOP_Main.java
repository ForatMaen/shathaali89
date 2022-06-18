package calculatorOOP;
import java.util.Scanner;

public class Cal_OOP_Main {

	public static void main(String[] args) {
		        int option =0;
		        double x = 0,y=0;
			    Scanner reader = new Scanner(System.in);
					while(option != 5) {
						  
					      
					      System.out.println("\nPlease chose option from the menu: ");
					      System.out.println("1-Addtion.");
					      System.out.println("2-Subtraction.");
					      System.out.println("3-Multiply");
					      System.out.println("4-Division");
					      System.out.println("5-End");
					     
					      option = reader.nextInt();
					      
					      switch(option) {
					      
					      case 1:
					  		Addition add= new Addition(x, y); //create obj of class and send value 
						  break;
						  
					      case 2:
					    	Subtraction sub = new Subtraction(x,y);//create obj of class and send value
					    	  break;
					    	  
					      case 3:
					    	  Multiply mul = new Multiply(x,y);//create obj of class and send value
					    	  break;
					    	  
					      case 4:
					    	  Division div = new Division(x,y);//create obj of class and send value
					    	  break;
					      case 5:
					    	  System.out.println("See you later");
					    	  break;
					      
					      }
					      
					      }
				}
	       
		
		
	}



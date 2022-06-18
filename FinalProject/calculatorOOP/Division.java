package calculatorOOP;
import java.util.Scanner;

public class Division {
	 double num1,num2, ans;
  
	 Scanner reader = new Scanner(System.in);
     
	 Division(double num1, double num2){
    	  System.out.print("Please Enter the first number: ");
    	  num1 = reader.nextDouble();
    	  System.out.print("Please Enter the second number: ");
    	  num2 = reader.nextDouble();
    	  ans = num1 / num2;
          System.out.print("Answer: "+ ans);

     }

}
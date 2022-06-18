package calculator;

import java.util.Scanner;
public class CalProcedural {
   public static void main(String[] args) {
      double num1,num2, ans;
      int option =0;
      Scanner reader = new Scanner(System.in);
      while(option != 5) {
    	  
      
      System.out.println("Please chose option from the menu: ");
      System.out.println("1-Addtion.");
      System.out.println("2-Subtraction.");
      System.out.println("3-Multiply");
      System.out.println("4-Division");
      System.out.println("5-End");
     
      option = reader.nextInt();
      
      switch(option) {
      
      case 1:
    	  System.out.print("Please Enter the first number: ");
    	  num1 = reader.nextDouble();
    	  System.out.print("Please Enter the second number: ");
    	  num2 = reader.nextDouble();
    	  ans = num1 + num2;
          System.out.print("answer: "+ ans);
	  break;
	  
      case 2:
    	  System.out.print("Please Enter the first number: ");
    	  num1 = reader.nextDouble();
    	  System.out.print("Please Enter the second number: ");
    	  num2 = reader.nextDouble();
    	  ans = num1 - num2;
          System.out.print("answer: "+ ans);
    	  break;
    	  
      case 3:
    	  System.out.print("Please Enter the first number: ");
    	  num1 = reader.nextDouble();
    	  System.out.print("Please Enter the second number: ");
    	  num2 = reader.nextDouble();
    	  ans = num1 * num2;
          System.out.print("answer: "+ ans);
    	  break;
    	  
      case 4:
    	  System.out.print("Please Enter the first number: ");
    	  num1 = reader.nextDouble();
    	  System.out.print("Please Enter the second number: ");
    	  num2 = reader.nextDouble();
    	  ans = num1 / num2;
          System.out.print("answer: "+ ans);
    	  break;
      
      }
      
      }
   }
}
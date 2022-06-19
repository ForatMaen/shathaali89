
// JAVA Code for Program that receives a number
// and prints it out in large size(Digital Form)
import java.util.Scanner;

class Binary1{
    public static void main(String[] args)
    {
               Scanner scanBinary = new Scanner(System.in);
		System.out.println("Please enter the any binary number:");
		 
		   int BinaryNum; 
		   BinaryNum= scanBinary.nextInt();    //for scanner the binary number
		   
		
		    if (BinaryOrNot(BinaryNum) == false){    
		             System.out.println(" The number entered is incorrect. Please enter a **Binary** number.");
		     
		  }
		  
		  else if(BinaryOrNot(BinaryNum) == true){
 
		   int decimal = convertBinaryToDecimal(BinaryNum);  // convert  the type from integer to String
		   String ConvertType =String.valueOf(decimal);     

		  
		   System.out.println("The Binary Number = " + decimal +" In Decimal..... and in digital form:");
		    PrintNumDigital(ConvertType);
		  
		}
	
  
    }
    public static void PrintNumDigital(String num)
    {
        int i, element; //controls  of each digil 
        
          String IX[]={"  - -  "," |   | ", "  - -  ", "     | ", "     | "};
          
          String VIII[]={"  - - "," |   |","  - - "," |   |", "  - - "};
          
          String VII[]={"  - -  ","     | ", "   - - ","     | ","     | "};
          
          String VI[]={"  - - "," |    ", "  - - ", " |   |","  - - "};
          
          String V[]={"  - - "," |    ","  - - ","     |","  - - "};
          
          String IV[]={"       "," |   | ","  - -  ","     | ","     | "};
          
          String III[]={"  - -  ","     | ","  - -  ","     | ","  - -  "};
          
          String II[]={"  - -  ","     | ","  - -  "," |     ","  - -  "};
          
          String I[]={"  /|   ","   |   ","   |   ","   |   "," - - - "};
      
          String zero[]={"  ---  "," |   | ","       "," |   | ","  ---  "};
      

                  
                   for(element = 0 ; element <= 4 ; element++) {  // to read element in arrays
                	
                
                    for (i = 0; i < num.length(); i ++)  //reads each digit 
                    {
                    	 char location = num.charAt(i);
                     
                        if (location == '0') {
                            System.out.print(zero[element]); 
                            System.out.print(zero[element]);
                        }
                        else if (location== '1') {
                            System.out.print(I[element]);
                        }
                        else if (location == '2') {
                            System.out.print(II[element]);
                        }
                        else if (location == '3') {
                            System.out.print(III[element]);
                        }
                        else if (location == '4') {
                            System.out.print(IV[element]);
                        }
                        else if (location == '5') {
                            System.out.print(V[element]);
                        }
                        else if (location == '6') {
                            System.out.print(VI[element]);
                        }
                        else if (location == '7') {
                            System.out.print(VII[element]);
                        }
                        else if (location == '8') {
                            System.out.print(VIII[element]);
                        }
                        else if (location == '9') {
                            System.out.print(IX[element]);
                        }
                    }
                     
                    System.out.print("\n"); //new line
                
                }
                }
    public static int convertBinaryToDecimal(int numB) {
        int DecimalNumber = 0, i = 0;        //i = exponent
        int TheRest;
        
        while (numB != 0) {
          TheRest = numB % 10;         // answer 0 or 1
           numB /= 10;                //It will be stored inside numB = numB divided by ten whenever loop is repeated.
          DecimalNumber +=  power(i) * TheRest;  //It will be stored the value of the decimal number whenever loop is repeated.
          ++i;                                 //increment the value of i
        }
        
        return DecimalNumber;
      }
 static int power(int exponent0)  
{  
int exponent = 1;  

for (int i = 1; i <= exponent0; i++) {  //increment the value of i after each iteration until the condition becomes false  
 
exponent *= 2;  //calculates power 
}
return exponent;  
}  
 
   public static boolean BinaryOrNot(int x) // Function to check if number is binary or not
    {  
        while (x != 0) {

            if (x % 10 > 1) {      // If the digit is greater than 1 return false,Because for any binary number the answer must be 1 or 0
                return false;
            }
            x = x / 10;
            
        }
        return true;
    }
}

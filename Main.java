package firstAssigment;

public class Main {

	public static void main(String[] args) {
     Student student1 = new Student();
     Car car1 = new Car(); 
     Mobile mobile1 = new Mobile();
     
     
     student1.studentName = "Forat Maen Al-Omoush";
     student1.studentMajor = "Ai & Data science";
     student1.studentId = 21110423;
     
     car1.color = "black";
     car1.model = "Mercedes";
     car1.year = 2017;
     
     mobile1.brand = "samsung";
     mobile1.color = "black";
     mobile1.camera = "64-megapixel";
     mobile1.yearOfProduction = 2022;
     
     
     System.out.println("Student Name: " +student1.studentName );
     System.out.println("Student ID: " +student1.studentId );
     System.out.println("Student Major: " +student1.studentMajor +"\n");
     
     System.out.println("The " + car1.color +" car, which was produced in "+ car1.year +", is "+ car1.model +".\n");

     System.out.println(mobile1.brand+" phone specifications:\n 1- It is" + mobile1.color+".\n 2- A "+mobile1.camera+ " camera.\n 3- Produced in"+ mobile1.yearOfProduction + ".");
	
	}

}

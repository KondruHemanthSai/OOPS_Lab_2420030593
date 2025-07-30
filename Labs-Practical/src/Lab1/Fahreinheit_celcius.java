package Lab1;
import java.util.*;

public class Fahreinheit_celcius {

	public static void main(String[] args) 
	{
		
		     Scanner sc=new Scanner(System.in);

		        System.out.print("Enter temperature in Fahrenheit: ");
		        double Fahrenheit= sc.nextDouble();

		       
		        double Celsius=(5.0/9.0)*(Fahrenheit-32);
		        
		        System.out.println("Temperature in Celsius -> " + Celsius);
		    }
		}


	



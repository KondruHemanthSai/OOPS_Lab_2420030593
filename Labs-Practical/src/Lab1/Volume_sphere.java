package Lab1;
import java.util.*;

public class Volume_sphere {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius ");
        double radius = sc.nextDouble();
        double pie=3.14;
       
        double volume = (4.0 / 3.0) *pie*radius*radius*radius;

        System.out.println("Volume of the sphere -> "+ volume);

	}

}

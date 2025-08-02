package Lab2;
import java.util.*;

public class Alphabet_check {

	public static void main(String[] args) 
	{
		
		System.out.println("enter: ");
		Scanner sc = new Scanner(System.in);
		
		char C;
		
		C = sc.next().charAt(0);

		
		if( C>=65 && C<=90 )
		{
			System.out.println("Character is an Alphabet!");
		}
		
		else if( C>=97 && C<=122 )
		{
			System.out.println("Character is an Alphabet!");
		}
		else
		{
			System.out.println("Character is not an Alphabet");
		}

	}

}

package Lab2;
import java.util.*;

public class Vowel_consonant {

	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
		
		char C;
		System.out.println("Enter character: ");
		C =sc.next().charAt(0);
		
		if(C=='a'||C=='e'||C=='i'||C=='o'||C=='u'||C=='A'||C=='E'||C=='I'||C=='O'||C=='U')
		{
			System.out.println("Aplhabet is a Vowel!");
		}
		else
		{
			System.out.println("Aplhabet is not a Vowel!");
		}

	}

}

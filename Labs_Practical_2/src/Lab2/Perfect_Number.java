package Lab2;
import java.util.*;

public class Perfect_Number {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter number ");
		num = sc.nextInt();
		
		int S = 0;
		int i;
		
		for(i=1;i<num;i++)
		{
			if(num%i==0&&i!=num)
			{
				S=S+i;
			}
			
		}
		
		System.out.println(S);
		
		  if (S== num) {
	            System.out.println(num+ " is a Perfect Number!");
	        } else {
	            System.out.println(num+ " is not a Perfect Number.");
	        }
	}

}

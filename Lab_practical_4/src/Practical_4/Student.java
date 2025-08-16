package Practical_4;
import java.util.*;

class Student 
{
	 
	private int rollnumber;
	protected int grade;
	public String name;
	


public void SetDetails(int ROLL, int GRADE , String NAME)
{
	
	rollnumber = ROLL;
	grade = GRADE;
	name = NAME;
}


public void showDetails()
{
	
	System.out.println("Rollnumber--> "+ rollnumber);
	System.out.println("Grade--> "+ grade);
	System.out.println("Name--> "+ name);
	
}
}
package Practical_4;
import mypackage.calculator;

public class Calculator_working 
{
    public static void main(String[] args) 
    {
        int a = 500;
        int b = 40;

        calculator c = new calculator();
        c.add(a, b);
        c.subtract(a, b);
    }
}

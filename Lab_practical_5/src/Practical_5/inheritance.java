package Practical_5;


class Transport
{

    void ticketPrice() 
    {
    System.out.println("transport ticket price");
    }
 
}


class Bus extends Transport
{

 void ticketPrice()
 {
 System.out.println("Bus price - 50");
 }
}

class Train extends Transport
{
 
 void ticketPrice() {
     System.out.println("Train price - 120");
 }
}


public class inheritance
{
 public static void main(String[] args) 
 {
     
     Transport t1 = new Bus();   
     Transport t2 = new Train(); 

  
     t1.ticketPrice();  
     t2.ticketPrice();
 }
}
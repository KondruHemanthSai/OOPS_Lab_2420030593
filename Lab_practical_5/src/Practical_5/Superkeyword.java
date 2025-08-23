package Practical_5;


class Order
{
 int orderid;
 String customername;


 Order(int orderid, String customername)
 {
     this.orderid = orderid;
     this.customername = customername;
 }


 void printDetails() 
 {
     System.out.println("Order: " + orderid);
     System.out.println("Customer name: " + customername);
 }
}


class OnlineOrder extends Order 
{
 String deliveryaddress;

 OnlineOrder(int orderid, String customername, String deliveryaddress) 
 {
     
     super(orderid, customername);
     this.deliveryaddress = deliveryaddress;
 }

 
 void printDetails() {
    
     super.printDetails();
    
     System.out.println("Delivery Address: " + deliveryaddress);
 }
}


public class Superkeyword
{
 public static void main(String[] args)
 {
    
     OnlineOrder order1 = new OnlineOrder(101, "Hemanth", "Hyderabad, India");

     
     order1.printDetails();
 }
}
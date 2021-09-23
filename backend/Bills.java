//Core java code for Billing package 
public class Bills {
    //display
    public static void display(int id,int quantity){
        Items it1=new Items();
        it1.createList();
        it1.displayItem(id);
        System.out.println("The item quantity is "+quantity);
    }
    //Variable declaration
   Bills(int id, int quantity){
    double totalPrice = 0.0;
        // total price for that product
        Items it=new Items();
        it.createList();
        double rate=it.getPrice(id);
        totalPrice = rate * quantity;
        Bills.display(id,quantity);
        // overall price
        System.out.println("\nYour Total Bill  = " + totalPrice);
   }
  }
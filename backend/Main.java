//core java code for main 
//this contains the main method and this the code to be executed
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Customers cust=new Customers();
		Items it=new Items();
		it.createList();
		Admins admin = new Admins();
		Scanner sc=new Scanner(System.in);
		System.out.println("Thank You For Choosing Us :) ");
		System.out.println("How Do You Want To Cointinue?");
		System.out.println("1.Admin");
		System.out.println("2.Customer");
		System.out.print("Choose One From The Above Option : ");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			System.out.println("Enter Your Id");
			int Aid=sc.nextInt();
			System.out.println("Enter Your Password");
			String Apswrd=sc.next();
			//duplicate func
			if(admin.login(Aid,Apswrd))
			{
				System.out.println("Hello Admin :)");
				System.out.println("What do you want to do?");
				System.out.println("1.View Customer Details");
				System.out.println("2.View Item Details");
				System.out.println("3.Manage Customer Details");
				System.out.println("4.Manage Item Details");
				System.out.print("Choose One From The Above Option : ");
				int aOpt=sc.nextInt();
				switch(aOpt){
					case 1:
						//duplicate fun print customer details
						//customerDetails();
						admin.view();
						System.out.println("Customer details printed");
						break;
					case 2:
						//duplicate fun print item details	
						//itemDetails();
						it.print();
						System.out.print("Item details printed");
						break;
					case 3:
						//customerDetails();
						admin.view();
						System.out.print("Customer details printed");
						System.out.println("What do you want to do?");
						System.out.println("1.Add Customer");
						System.out.println("2.Remove Customer");
						System.out.println("Choose One From The Above Option : ");
						int mcOpt=sc.nextInt();
						switch(mcOpt){
							case 1:
								//function call to add the customer into customer list
								cust.signup();
								System.out.println("Customer details added");
								admin.view();
								break;
							case 2:
								System.out.print("Enter the customer id to be removed:");
								int mcrid=sc.nextInt();
								//check if customer id exists or not
								//if exists
								//call customer remove function
								cust.remove(mcrid);
								System.out.println("Customer removed");
								//else invalid customer
								break;
						}
						break;
						case 4:
							//ITEMDetails();
							it.print();
							System.out.print("Item details printed");
							System.out.println("What do you want to do?");
							System.out.println("1.Add Item");
							System.out.println("2.Remove Item");
							System.out.println("3.Change price of a particular item");
							System.out.println("Choose One From The Above Option : ");
							int miOpt=sc.nextInt();
							switch(miOpt){
								case 1:
									//function call to add the item into item list
									it.addItem();
									System.out.println("Item details added");
									break;
								case 2:
									System.out.print("Enter the item id to be removed:");
									int mirid=sc.nextInt();//mirid=manage item remove id
									//check if item id exists or not
									//if exists
									//call item remove function
									it.removeItem(mirid);
									System.out.println("Item removed");
									break;
								case 3:
									System.out.print("Enter the id of item for which price is to be changed:");
									int miupid=sc.nextInt();//miuid=manage item update price of id
									System.out.println("Enter the new price:");
									double newprice=sc.nextDouble();
									//check if item id exists or not
									//if exists
									//call item price update function
									it.changeRate(miupid,newprice);
									System.out.println("Item price updated");
									//print item list
									break;
							}
				}
			}
			else{
				System.out.println("Invalid Details");
			}
			break;
			//main switch second case for customers
			case 2:
				System.out.println("What do you want to do?:");
				System.out.println("1.Sign in");
				System.out.println("2.Sign Up");
				int cOpt=sc.nextInt();
				switch(cOpt){
					case 1:
						System.out.println("Enter Your Id");
						int cid=sc.nextInt();
						System.out.println("Enter Your Password");
						String cpswrd=sc.next();
							if(cust.login(cid,cpswrd)){//checking customer login detail
								System.out.println("Hello Customer Greetings for the day!! :)");
							//showing items list
							it.print();
							System.out.println("Do you want to buy anything?");
							System.out.println("1.Yes");
							System.out.println("2.No");
							System.out.println("Choose one from the above:");
							int custChoice=sc.nextInt();
							switch(custChoice){
								case 1:
									System.out.println("Enter the item id you want to buy from the above list:");
									int cbiid=sc.nextInt();//cbiid = customer buying item id
									System.out.println("Enter the quantity of this item you want:");
									int quantity=sc.nextInt();
									//call bill funtion
									Bills billing = new Bills(cbiid,quantity);
									System.out.println("Thank you for shopping with us HAVE A NICE DAY :)");
									break;
								case 2:
									System.out.println("Thank you for your time, hope you shop with us soon :(");
									break;
							}
							}
							else{
								System.out.println("Invalid User");
								System.exit(0);
							}	
						break;
						case 2:
							System.out.println("Hi..");
							//registration process
							cust.signup();
							System.out.println("Thank you for registering with us HAVE A NICE DAY :)");
							break;
				}
				
		}
	}
}
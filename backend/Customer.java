import  java.util.*;
import java.io.*;
class Customer extends Exception{
    String cname,password,phNo;
}
public class Customers extends Exception
{
    private HashMap<Integer,Customer> hm=new HashMap<Integer,Customer>();//Created hashmap to store the values of the customer
    Customers(){
        Customer l=new Customer();
        l.cname="Revanth";
        l.password="Password";
        l.phNo="9703531900";
        hm.put(16900,l);
        l=new Customer();
        l.cname="Vamshi";
        l.password="Password";
        l.phNo="9398979743";
        hm.put(17900,l);
        l.cname="Aditya";
        l.password="Password";
        l.phNo="97035545200";
        hm.put(18001,l);
        l.cname="Abhilash";
        l.password="Password";
        l.phNo="9849040420";
        hm.put(18030,l);
        l.cname="Pranay";
        l.password="Password";
        l.phNo="8254828200";
        hm.put(19054,l);
    }
    void allCustoDetails(){
        for(Map.Entry e:hm.entrySet()){
            Customer c=(Customer)e.getValue();
            System.out.println("Customer id: "+e.getKey()+" "+"Customer Name: "+c.cname+" "+"Contact no: "+c.phNo); //Retreiving the details of the customer by traversing through hashmap
        }
    }
    void remove(int cid){
        if(hm.containsKey(cid)){
            System.out.println("User "+this.hm.get(cid).cname+" Removed successfully"); //Removing the customer details by using id
            this.hm.remove(cid);
        }
    }
    boolean login(int cid,String password){
        if(hm.containsKey(cid) && hm.get(cid).password.equals(password)){
            return true;
        }
        //if any value is not correct then return Customer details incorrect.
        return false;
    }
    String getName(int cid){
        return this.hm.get(cid).cname; 
        //get name of customer based on id
    }
    String getPhno(int cid){
        return this.hm.get(cid).phNo;
        //get contact no of customer based on id.
    }
    void signup(){
        int cid;
        String phno;
        Scanner sc=new Scanner(System.in);
        String name,password;
        while(true){
        System.out.print("Enter 5 digit customer id: ");
        cid=sc.nextInt();
        //if user selected id is already exists or id is not of 5 digit number then he need to select id again
		if(String.valueOf(cid).length()!=5){
			System.out.println("Enter valid id number");
			continue;
		}
        if(hm.containsKey(cid)){
            System.out.print("\nalready exists select new one ");
        }
        else
        break;
        }
        //Console class is just used to read password
        Console con=System.console();
        System.out.print("Create password: ");
        password=String.valueOf(con.readPassword());
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter phno: ");
        phno=sc.next();
        Customer l=new Customer();
        l.cname=name;
        l.phNo=phno;
        l.password=password;
        //Storing new Customer details in hashmap by taking id as key.
        hm.put(cid,l);
    }
/*public static void main(String[] args) {
Customers m=new Customers();
int cid;String password;
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Hello Welcome to the Delta Online Shopping \nPress 1 for login\nNew User? Press 2 for signup");
c=sc.nextInt();
switch(c){
case 1:	
System.out.print("Enter Customer Id: ");
cid=sc.nextInt();
Console con=System.console();
System.out.print("Enter Password: ");
password=String.valueOf(con.readPassword());
try{
if(m.login(cid,password)){
   System.out.print("Login success");
}
else
throw new Customer();
}
catch(Customer e){
    System.out.println("Invalid User");
}break;
case 2:m.signup();
System.out.println("Signed up successfully");
break;
default :System.out.println("Enter a Valid choice Broo...");
}
}*/
}
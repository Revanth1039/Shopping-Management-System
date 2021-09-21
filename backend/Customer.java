import  java.util.*;
import java.io.*;
class Customer extends Exception{
    String cname,password,phNo;
}
public class Customers extends Exception
{
    private HashMap<Integer,Customer> hm=new HashMap<Integer,Customer>();
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
    }
    void allCustoDetails(){
        for(Map.Entry e:hm.entrySet()){
            Customer c=(Customer)e.getValue();
            System.out.println("Customer id: "+e.getKey()+" "+"Customer Name: "+c.cname+" "+"Contact no: "+c.phNo);/*Added by revanth*/
        }
    }
    void remove(int cid){
        if(hm.containsKey(cid)){
            System.out.println("User "+this.hm.get(cid).cname+" Removed successfully");
            this.hm.remove(cid);
        }
    }
    boolean login(int cid,String password){
        if(hm.containsKey(cid) && hm.get(cid).password.equals(password)){

            return true;
        }
        return false;
    }
    /*String getName(int cid){
        return this.hm.get(cid).cname;
    }
    String getPhno(int cid){
        return this.hm.get(cid).phNo;
    }*/
    void signup(){
        int cid;
        String phno;
        Scanner sc=new Scanner(System.in);
        String name,password;
        while(true){
        System.out.print("Enter 5 digit customer id: ");
        cid=sc.nextInt();
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
        Console con=System.console();/*Added by revanth to read the password*/
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
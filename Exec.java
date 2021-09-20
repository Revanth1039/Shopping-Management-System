import  java.util.*;
class Customer{
    String cname,password,phNo;
    //long phNo;
   
}
public class Exec extends Exception
{
    private HashMap<Integer,Customer> hm=new HashMap<Integer,Customer>();
    Exec(){
        Customer l=new Customer();
        l.cname="Revanth";
        l.password="Password";
        l.phNo="9703531900";
        hm.put(16900,l);
        l.cname="Vamshi";
        l.password="Password";
        l.phNo="9398979743";

        hm.put(17900,l);
    }
    boolean login(int cid,String password){
        if(hm.containsKey(cid) && hm.get(cid).password.equals(password)){

            return true;
        }
        return false;
    }
    void signup(){
        int cid;
        //long phno;
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
        System.out.print("Create password: ");

        password=sc.next();
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter phno: ");
        phno=sc.next();
        Customer l=new Customer();
        l.cname=name;
        l.phNo=phno;
        l.password=password;

        hm.put(cid,l);
        System.out.print("User added Successfully");
    }
public static void main(String[] args) {
Exec m=new Exec();
int cid;String password;
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Hello Welcome to the Delta Online Shopping \nPress 1 for login\nNew User? Press 2 for signup");
c=sc.nextInt();
switch(c){
case 1:	
System.out.print("Enter Customer Id: ");
cid=sc.nextInt();
System.out.print("Enter Password: ");
password=sc.next();
try{

if(m.login(cid,password)){
   System.out.print("Login success");
}
else
throw new Exception();
}
catch(Exception e){
    System.out.println("Invalid User");
}break;
case 2:m.signup();
break;
default :System.out.println("Enter a Valid choice Broo...");
}
}
}
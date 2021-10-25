import java.util.*;
class Admin{
	private String adminName,password,contactNo;
	String getName(){
		return this.adminName;
	}
	void setName(String s){
		this.adminName=s;
	}
	String getPassword(){
		return this.password;
	}
	void setPassword(String s){
		this.password=s;
	}
	String getContactno(){
		return this.contactNo;
	}
	void setContactno(String s){
		this.contactNo=s;
	}
}
class Admins{
	private HashMap<Integer,Admin> hm=new HashMap<>();
	Customers c;
	Items i;
	public Admins(){
		c=new Customers();
		i=new Items();
		i.createList();
		Admin ad=new Admin();
		//Items i=new Items();
		ad.setName("Revanth");
		ad.setPassword("Password");
		ad.setContactno("9703531900");
		hm.put(16900,ad);
		ad=new Admin();
		ad.setName("Vamshi");
		ad.setPassword("Password");
		ad.setContactno("6303877578");
		hm.put(17900,ad);
	}
	boolean login(int cid,String password){
		if(hm.containsKey(cid) && hm.get(cid).getPassword().equals(password)){
            return true;
        }return false;
	}void view(){
		c.allCustoDetails();
	}void addcus(){
		c.signup();
	}void removecus(int id){
		c.remove(id);
	}void addNewItem(int n,String itname,double rate){
		i.addItem();
	}void changePrice(int n,double price){
		i.changeRate(n,price);
		
	}void remitem(int n){
		i.removeItem(n)
;
	}void showItems(){
		i.print();
	}public static void main(String args[]){
		Admins a=new Admins();
		a.login(16900,"Password");
		a.removecus(17900);
		a.view();
		a.changePrice(1,60.0);
		a.remitem(4);
		a.showItems();
	}
}

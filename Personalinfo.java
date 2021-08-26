
public class Personalinfo {

	public String name; 
private long  ID ;
private String Password;

// Default constructor
public Personalinfo() {
	
name = "Empty";
ID = 11111111;
Password = null;
}

public Personalinfo(String n,int id, String pas) {
this.ID = id;
this.name = n;
this.Password = pas;
}

public String getName(String name) {
	this.name = name;
	return name;
}
public long getID(long ID) {
	this.ID = ID;
	return ID;
}
public String getPassword(String password) {
	this.Password = password;
	return password;
}
public void printInfo() {
	System.out.println("Welcome: " + name);
	System.out.println("your ID is : " + ID );
	System.out.println("Password : " + Password);
	
}

}
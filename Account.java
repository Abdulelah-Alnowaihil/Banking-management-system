public class Account {
private double Debosite; 
private double Balance;
private double widthrow;
private double previousTransaction;
private double Transfer;

public double getDebosit(double debosit) {
	if(debosit>0) {
	this.Debosite = debosit;
previousTransaction = +debosit;
Balance+=Debosite;
return debosit;
	
	}
	else {
		System.out.println("Invalid input");
		return 0;
	}
	}
public double getBalance(double bal) {
	if(bal >-1) {
		Balance = bal;
		return Balance;
	}
	else {
		System.out.println("Invalid input");
		return 0;
	}
	
}

public double getWidthrow(double width) {
	if(width>0 && width<=Balance) {
		this.widthrow = width;
  Balance-=width;
	previousTransaction = -width;
		return width;
	}
	else {
		System.out.println("Invalid input");
		return 0;
	}
}
public void previous() {
	System.out.println(previousTransaction);
}
static double x;
public void getTransfer(double transfer) {
	if(transfer>0 && transfer<=Balance) {
		x+=transfer;
		this.Transfer = transfer;
		previousTransaction = -transfer;
		Balance-=transfer;

	}
	else {
		System.out.println("Invalid input ");
	
	}
}
public void print() {
	System.out.println("your current balance = " + getBalance(Balance));
	System.out.println("Deposite = " + Debosite);

	System.out.println("Widthrow = " + widthrow);
	System.out.print("Previous transaction : ");
	previous();
	System.out.println("Transfer process : " + Transfer);
	System.out.println("Total of transfers : " + x);

}
}

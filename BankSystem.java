import java.security.MessageDigest;
import java.util.Scanner; 

public class BankSystem {
        public  static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        	Personalinfo Information = new Personalinfo();	  
        	try {
        	
        	System.out.println("Enter your name : ");
        	Information.getName(input.nextLine());
        	System.out.println("Enter your ID : ");
        	Information.getID(input.nextLong());
        	input.nextLine();
        	System.out.println("Enter your Password ");
        	Information.getPassword(input.nextLine());
        	Information.printInfo();
        }
        catch(Exception e) {
        	System.out.println("Error. " +e.getMessage());
        }
        
        Account acc = new Account();
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("\t \t \t \t \t \t \t \t \t \t (Welcome to Al rajhi bank system)");
      
        System.out.println("Enter your balance account");
		acc.getBalance(input.nextDouble());
        System.out.println("Choose the letter to see the results");
        System.out.println("===============================================");
        System.out.println("A: Balance account");
        System.out.println("B: Previous transaction ");
        System.out.println("C: widthrow ");
        System.out.println("D: Debosit");
        System.out.println("G: Information account ");  
        System.out.println("T: Money transfer process ");
        System.out.println("E: Exit");
        System.out.println("===============================================");
        try {
        char letter;
        System.out.println("Enter letter");
        letter = input.next().toUpperCase().charAt(0);
        int x = 0;

        while(letter!='E') {
        	
        	switch (letter) {
			case 'A': {
				System.out.println("Enter your balance account");
				acc.getBalance(input.nextDouble());
				
			}
			break;
			case 'B':{
				acc.previous();
			}
			break;
			case 'C':{
				System.out.println("Enter number of widthrow");
				acc.getWidthrow(input.nextDouble());
			}
			break;
			case 'D':{
				System.out.println("Enter number of debosit");
				acc.getDebosit(input.nextDouble());
			}
			break;
			case 'G':{
						acc.print();
			}
			break;
			
			case 'T':{
				input.nextLine();
				String nam;
				System.out.println("Enter name that you would to transfer money to it : ");
			nam = input.nextLine();
			System.out.println("Enter amount of money for transfer : ");
			acc.getTransfer(input.nextDouble());
			
			}
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + letter);
			}
        	
        	
        	
        	 System.out.println("Enter letter");
        	 letter = input.next().toUpperCase().charAt(0);
        	 if(letter == 'E') {
        		 System.out.println("Thank you " + Information.name + " for use our service ");
        	 break;
        	 }
        }
        }
        catch(Exception m ) {
        	System.out.println("Error " + m.getMessage());
        }
        }
        
}
         
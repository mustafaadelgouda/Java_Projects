package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fname, lname;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first_name: ");
		fname = input.next();
		
		System.out.print("Enter your last_name: ");
		lname = input.next();
		
		
		
		Email em1 =  new Email(fname,lname);
		
		String altemail = "mustafa.adel.gouda@outlook.com";
		em1.setAlternateEmail(altemail);
		
		System.out.println("Alternate email: "+em1.getAlternateEmail());	
		em1.showInfo();

	}

}

package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail = "None";
	private String companySuffix = "MAG.com";
	
	
	//Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created successfully...");
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Your department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " +this.password);
		
		//Combine elements to generate email.
		email = firstName.toLowerCase() + "." + lastName.toLowerCase()+"@" + department +"."+ companySuffix;
		System.out.println("Your email: " + email);
		
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("**********Select the department Code**********\n[1] Sales\n[2] Development\n[3] Accounting\n[0] none\n");
		System.out.print("Enter your department code: ");
		Scanner input = new Scanner(System.in);
		int deptChoice = input.nextInt();
		System.out.println("\n**********INFORMATION**********");
		if (deptChoice == 1) {return "Sales";}
		else if (deptChoice == 2) {return "Development";}
		else if (deptChoice == 3) {return "Accounting";}
		else {return "None";}
		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWSYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//Set the mailbox capacity
	public void setMailCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altemail) {
		this.alternateEmail = altemail;
	}
	
	//Change the password 
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Get mail box capacity
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	
	//Get the alternate email 
	public String getAlternateEmail() {return alternateEmail;}
	
	//Get password
	public String getPassword() {return password;}
	
	//Show info
	public void showInfo() {
		System.out.println("\n**********SUMMARY**********");
		System.out.println("Display name: "+firstName.toUpperCase() +" "+ lastName.toUpperCase());
		System.out.println("Company Email: "+email);
		System.out.println("Mail box capacity: "+mailBoxCapacity +"MB");
	}

}

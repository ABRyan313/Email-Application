package emailApp;
import java.util.*;

public class Email {
	
	private String fname;
	private String lname;
	private String password;
	private String department;
	private String altMail;
	private int boxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix = "edu.bd";
	
	public Email(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		
		System.out.println(fname +" "+ lname);
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:" + this.password);
		
		email = fname.toLowerCase() + "." + lname.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println(email);
		
		this.altMail = getAltMail();
		
	}
	
	private String setDepartment() {
		System.out.println("Enter department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner sc = new Scanner (System.in);
		int deptChoice = sc.nextInt();
		if(deptChoice == 1) {
			return "Sales";
		}
	    if (deptChoice == 2) {
			return "Development";
		}
		
		if(deptChoice == 3) {
			return "Accounting";
		}
		
		else
			return " ";
	}
	
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%&*_-";
		char [] password = new char [length];
		
		for (int i = 0; i < length; ++i	) {
			int rand = (int) (Math.random() * passwordSet.length());
			password [i] = passwordSet.charAt(rand);
			
		}
		
		return new String (password);
		
	
	}
	
	public void setBoxCapacity(int Capacity) {
		this.boxCapacity = Capacity;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}

	public void setAltMail (String mail) {
		this.altMail = mail;
	}
	
	public int getBoxCapacity() {
		return boxCapacity;
	}

	public String getAltMail() {
		return altMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return fname + " " + lname + "," + "password=" + password + ", department=" + department
				+ ", altMail=" + altMail + ", boxCapacity=" + boxCapacity + ", email=" + email;
	}

	
	
	
	

}

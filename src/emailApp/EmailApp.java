package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em = new Email("AB", "Ryan");
		
		em.setAltMail("AudriUdash@gmail.com");
		System.out.println("Alternate Email" + em.getAltMail());
		System.out.println(em.toString());

	}

	

}

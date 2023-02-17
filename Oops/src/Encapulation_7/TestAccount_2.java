package Encapulation_7;

public class TestAccount_2 {

	public static void main(String[] args) {
		//creating object for Account class which has private data members we accessing here
		Account_2 a1 = new Account_2();
		a1.setAcc_no(444555);
		a1.setName("mahesh");
		a1.setEmail("mahi@gamil.com");
		a1.setAmount(450000);
		
		//now getter() will calling 
		System.out.println(a1.getAcc_no() + "\t"+ a1.getName() +"\t"+ a1.getEmail() + "\t"+ a1.getAcc_no());
	}

}

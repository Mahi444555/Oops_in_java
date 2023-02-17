package Encapulation_7;

public class Account_2 {

	private long acc_no;
	private String name, email;
	private float amount;
	
	
	public long getAcc_no() {		//getters() to get the value
		return acc_no;
	}
	
	public void setAcc_no(long acc_no) {	//setter() to set the value
		this.acc_no = acc_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}

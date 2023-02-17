package Super_keyword_3;
import java.util.*;
import java.util.Scanner;


class Tv{
	
	String name;
	
	
	void name(String name) {
		this.name = name;
	}
	void displayInfo() {
		System.out.println(name);
	}
}

class Hero extends Tv{
	String name="salman khan";
	
	void display() {
		System.out.println(name);
		super.name("mahesh");		//calling parent class method and passing value to it 
		super.displayInfo();		//calling parent class method and displaying info
	}
	
}
public class super_2 {

	public static void main(String[] args) {
		//creating object
		Hero h1 = new Hero();
		h1.display();
		
	
		
	}

}

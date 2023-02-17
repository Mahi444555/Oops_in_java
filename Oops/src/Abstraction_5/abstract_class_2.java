package Abstraction_5;
import java.util.Scanner;
import java.util.*;


abstract class Bank_1{
	abstract int getRateOfInterest();	//these method we implement in another class
	
}

class SBI extends Bank_1{
	int getRateOfInterest() {		//here we implementing that method
		return 7;
	}
}

class RBI extends Bank_1{
	int getRateOfInterest() {
		return 8;
	}
}

class PNB extends Bank_1{
	int getRateOfInterest() {
		return 11;
	}
}


public class abstract_class_2 {

	public static void main(String[] args) {
		//creating object of class 
		Bank_1 b1 = new SBI();
		System.out.println(	b1.getRateOfInterest()); //calling SBI class methods
		PNB p1 = new PNB();
	System.out.println(	p1.getRateOfInterest());
	}

}

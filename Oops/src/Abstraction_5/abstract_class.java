//A class which declare with the abstract keyword is known as an abstract class in java
//when we declare any method as abstract in class then we not implement in same class that method we impliment them 
// in another class
//abstract method can have abstract method and non abstract method 
//-it's process of hiding data or implementation details and showing only functionality to the user.


package Abstraction_5;
import java.util.*;
import java.util.Scanner;

abstract class Bike{
	abstract void run();		//here we created abstract class and method we implement 
}

class Honda extends Bike{
	void run() {				//here we implementing abstract run() method
		System.out.println("running safely");   
	}
}

public class abstract_class {

	public static void main(String[] args) {
		//creating object for class
		Bike b1 = new Honda();
		b1.run();
	}

}

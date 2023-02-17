//super keyword is used to call the super class i.e. parent class method or variables etc. from child class


package Super_keyword_3;
import java.util.*;
import java.util.Scanner;

class Colors{
	String color="red";
	int add() {
		return 10+20;
	}
}

class Dog extends Colors{
	String color="pink";
	
	void display() {
		System.out.println(color); 	//it will access nearest variable value...
		System.out.println(super.color);	//super it will acess super class variable(parent class)
		System.out.println(super.add());	//calling super class method 
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.display();
		
	}

}











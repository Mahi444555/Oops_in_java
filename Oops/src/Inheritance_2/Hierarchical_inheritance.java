//in hierarchical inheritance only one parent and multiple child classes present...
package Inheritance_2;
import java.util.*;
import java.util.Scanner;

class Living{	//parent class
	
	void eat() {
		System.out.println("eating...");
	}
}

class Dogg extends Living{		//child class
	
	void bark() {
		System.out.println("dog is barking...");
	}
}

class Cat extends Living{
	
	void meow() {
		System.out.println("cats are meowing...");
	}
}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		//here create object
		Cat c1 = new Cat();
		c1.meow();
		//create object for Dogg class
		Dogg d1 = new Dogg();
		d1.bark();
		
		Living l1 = new Living();
		l1.eat();
		
	}

}

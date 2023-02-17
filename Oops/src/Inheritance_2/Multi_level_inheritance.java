package Inheritance_2;
import java.util.*;
import java.util.Scanner;

class Animal{						//this is parent class
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal{		//this is child of Animal class and parent of BabyDog class
	
	void bark() {
		System.out.println("dog is barking...");
	}
}
	
class BabyDog extends Dog{		//this is child of Dog class it's like multiple levels
	 	
	void weep() {
		System.out.println("Weeping...");
	}
}

public class Multi_level_inheritance {

	public static void main(String[] args) {
		//create object
		
		BabyDog d1 = new BabyDog();		//if we inherits any class then we can call them to creating child class objects and call any methods
		d1.weep();
		d1.bark();
		d1.eat();

	}

}

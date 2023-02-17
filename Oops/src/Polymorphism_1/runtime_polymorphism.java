/* runtime polymorphism is 2nd type of polymorphism in which function overriding includes 
 function overriding : is nothing but the same function is present int child class with same parameters 
 						as in parent class called as function overriding (it need two different classes)
 (it is only valid in Inheritance)
 */
package Polymorphism_1;
import java.util.*;
import java.util.Scanner;

class Dog{
	
	void dogi() {
		System.out.println("I'm barking");
	}
	
}

class BabyDog extends Dog{
	
	void dogi() {					//same function present in child class as parent then called funciton_overriding
		System.out.println("I'm baby dog");
	}
}

class mahesh extends BabyDog{
	
	void dogi(String name) {
		System.out.println("My dog name is: "+name);
	}
}

public class runtime_polymorphism {
	public static void main(String[] args) {
		//create an object of Animal class
		Dog d1 = new Dog();
		d1.dogi();
		
		BabyDog d2 = new BabyDog();
		d2.dogi();
		
		mahesh m1 = new mahesh();
		m1.dogi("tom");
	}

}

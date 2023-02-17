/* Polymorphism is nothing but the one thing but many forms i.e. we can make many works from single man/function/etc.
 it has two types compiletime polymorphism and runtime polymorphism in which
1.compile time means function called at program compile time, 
2.runtime means function called at program runtime.

compile time => function overloading,
  run	time  =>  	function overriding 
  
  //now above program is on compile time => function overloading
  -function overloading is : multiple function with same name but with different no of arguments in a same class
  -function overriding is : same function is present in child class as in parent class with same arguments.(we see it in Inheritance)
*/

package Polymorphism_1;
import java.util.*;
import java.util.Scanner;

class Animal{
	
	//here mahesh() method is same but working is different.
	
	public void mahesh() {
		System.out.println("i'm working");
	}
	public void mahesh(String color) {
		System.out.println("i'm wearing this color shirt:"+ ""+ color);
	}
	public void mahesh(String profession, int salary) {
		System.out.println("my profession is:"+""+profession + "my salary is:"+salary);
	}
}

public class Compiletime_Polymorphism {

	public static void main(String[] args) {
		//creating object for Animal class to call it's method 
		Animal a1 = new Animal();
		a1.mahesh();
		a1.mahesh("black");
		a1.mahesh("software_developer", 550000);
	}

}

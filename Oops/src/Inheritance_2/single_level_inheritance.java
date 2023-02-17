/*Inheritance is nothing but the child class inherits all the property of child class called inheritance 
 :in single Level inheritance only one child is present 
 */
package Inheritance_2;
import java.util.*;
import java.util.Scanner;

class New{
	
	String name;
	String city;	//this two variables we using in child class i.e. inherits 
	
	void singer() {
		System.out.println("My favorite singer: Satindar Sartaj");
	}
	
}

class First extends New{	//here First is child class and extending all property of New class
	
	void song(String name, String city) {
		this.name = name;		//here we accessing parent class variable and assing them value and using here
		this.city = city;
	}
	
	void display() {
		System.out.println("My favorite song :"+ name);
	}
	
	void city() {
		System.out.println("I'm living in city:"+ city);
	}
}

public class single_level_inheritance {

	public static void main(String[] args) {

		//creating object for class
		New a1 = new New();
		a1.singer();
		
		//create object for First class
		First f1 = new First();
		f1.name ="Nihaar Lain De";
		f1.city ="Amritsar_punjab";
		f1.display();
		f1.city();
		
		
		
	}

}
 
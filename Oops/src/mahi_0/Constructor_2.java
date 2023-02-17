//Constructor in java types default constructor, parameterized constructor, copy constructor
//Constructor having same name as class name but without return type used to assign values inside class
//where as soon as possible once obj is created constructor get called automatically...
package mahi_0;
import java.util.*;
import java.util.Scanner;

class Animal{
	
	String name;
	int salary;
	
	public void display() {
		System.out.println("local "+""+name );
		System.out.println("local "+""+salary);
	}
	
	Animal(){	//this is default type constructor i.e. no parameter / arguments 
		System.out.println("i'm default constructor");
	}
	
	Animal(String name, int salary){	//parameterized constructor passing parameters and assing values to local variabels
		this.name = name;
		this.salary = salary;
	}
	
}

//for copy constructor we creating new class and write logic their 
class copy_const{
	
	copy_const(Animal a2){
		System.out.println("i'm copy constructor copyed data of object a2: "+ a2.name);
		System.out.println("i'm copy constructor copyed data of object a2: "+ a2.salary);
	}
}

public class Constructor_2 {

	public static void main(String[] args) {
		//creating class object
			Animal a1 = new Animal();				//default constructor
			Animal a2 = new Animal("mahi",50000);	//parameterized constructor
			a2.display();  							//calling method using it's object

			copy_const a3 = new copy_const(a2);		//copy constructor used to copy object to another 
	}
}

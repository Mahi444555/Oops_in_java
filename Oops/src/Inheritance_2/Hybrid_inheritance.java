//hybrid inheritance is combination of all inheritance

package Inheritance_2;
import java.util.*;
import java.util.Scanner;

class Parent{
	
	void relation() {
		System.out.println("we are all in relation");
	}
}

class Father extends Parent{		//single level inheritance
	
	void working() {
		System.out.println("i'm working");
	}
}

class Childs extends Father{	//here multi level inheritance is doing Parent => Father => Childs
		
	void sons() {
		System.out.println("we are sons of Father...");
	}
}

class Wife extends Parent{	//hierarchical inheritance i.e. one parent but multiple child
	
}
public class Hybrid_inheritance {

	public static void main(String[] args) {
		//creating object for class
		Childs c1 = new Childs();
		c1.sons();
		//creating objects for class Parent
		Parent p1 = new Parent();
		p1.relation();
		
	}

}

//classes and objects and 'this' keyword in java...
package mahi_0;
import java.util.Scanner;
import java.util.*;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("i'm writting");
	}
	public void colr_type(String color, String type) {
		this.color= color;	//this keyword is used to show current object
		this.type = type;	//here we initializing global values to local variable 
	}
	
	public void display() {
		System.out.println("color of pen :"+" "+ color);
		System.out.println("type of pen :"+" "+ type);
	}	
}

public class Class_object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter color and type of pen");
		String color = sc.nextLine();
		String type = sc.nextLine();
		
		//creating object for class Pen
		Pen p1 = new Pen();
		p1.colr_type(color, type);
		p1.display();

	}

}

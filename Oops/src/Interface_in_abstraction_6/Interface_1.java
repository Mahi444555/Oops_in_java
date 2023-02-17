/* Abstraction can be achieve by these two types 1. abstract class and 2. Interface
 2) Interface is nothing but we use interface keyword to declare class...
 : Interface always needs only abstract methods and the group of abstract method is called Interface...
 here we use "implements" keyword instead of "extends" keyword...
 */

package Interface_in_abstraction_6;
import java.util.*;
import java.util.Scanner;

interface printable{
	
	void print();
}

class Display implements printable{
	
	public void print() {
		System.out.println("Hello we using Interface class method using implements");
	}
}

public class Interface_1 {

	public static void main(String[] args) {
		//creating object for class
		Display d1 = new Display();
		d1.print();
	}

}

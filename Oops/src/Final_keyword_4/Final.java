 //final keyword used to make any method or class final where no one can change that variable etc..
//we can't do method overriding i.e. in same function in child as parent class 
//it stops inheritance of class when it final class

package Final_keyword_4;
import java.util.*;
import java.util.Scanner;

class Mahi{
	final int speedlimit = 90;
	void run() {
		System.out.println("speed of bike is"+" "+ speedlimit);
	}
	void maxspeed() {
		//speedlimit = 100;	//
		System.out.println("new speed is: "+ speedlimit );  //gives error we can't assign or change final 
															//variable value
	}
	 
}



public class Final {

	public static void main(String[] args) {
		//create class object
		Mahi  m1 = new Mahi();
		m1.run();
		m1.maxspeed();
		
	}

}

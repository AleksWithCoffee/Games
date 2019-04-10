package olek.com.MavenProject;

import java.util.Scanner;

public class Processor {

	public void produce() throws Exception{	
		synchronized(this) {
			System.out.println("produce is running");
		wait();
		System.out.println("resumed");
		}
	}
	public void consume()throws Exception {
		Thread.sleep(2000);
		Scanner scanner=new Scanner(System.in);
		synchronized(this) { //notify musi byc zwrocony przez ten sam obiekt ktory czeka
			System.out.print("Waiting for return key. ");
			scanner.nextLine();
			System.out.println("Return key pressed");
			
			notify();
			
		}
	}

}

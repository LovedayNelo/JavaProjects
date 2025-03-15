package myfirstjavaprogram;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World...");
		System.out.print("This is my first Java program");

	}

}


/*
 how to create a jar file which can run standalone
  1. Go to your project and do a right click and locate "Export"
  2. On the select modal- type in "jar" and select option of JAR file
  3. Go to "Next" and select the location- remember to create a new folder and add a filename with .jar extension
  4. Click on Next=> Next and select a main class; browse and select the main class
  click on OK and finish
  5.Go to your terminal and cd to the location where your JAR is located
  6. Then type in java -jar HelloWorld.jar i.e. the name of the jar file
*/
package exceptionhandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			System.out.println("I am Great Edhughoro....");
			int i = 1/0;
			System.out.println("Completed");
		}
		catch(Exception exp) {
			System.out.println("I am inside catch block");
			System.out.println("Message is : " +exp.getMessage());
			System.out.println("Cause is : " +exp.getCause());
exp.printStackTrace();

			
		     }
		finally {
			System.out.println("I am inside finally block");
		}
		}
		
	}



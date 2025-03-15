package classesandobjects;

public class AccountHolderObjects {
	public static void main(String[] args) {
		
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibilityForCreditCard();
		
		System.out.println("Is Tom eligible for CC: "+tom.testEligibilityForCreditCard());
		
		
		henry.firstName = "Henry";
		henry.lastName = "Hill";
		henry.age = 31;
		henry.accountBalance = 20000;
		henry.testEligibilityForCreditCard();
		
		System.out.println("Is Henry eligible for CC: "+henry.testEligibilityForCreditCard());
		
		
		sarah.firstName = "Sarah";
		sarah.lastName = "Miller";
		sarah.age = 41;
		sarah.accountBalance = 30000;
		sarah.testEligibilityForCreditCard();
		
		System.out.println("Is Sarah eligible for CC: "+sarah.testEligibilityForCreditCard());

	}

}

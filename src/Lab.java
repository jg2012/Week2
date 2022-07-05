
public class Lab {

	public static void main(String[] args) {
		// create a variable named age and assign it a variable of 14
		int age = 14; 
		
		//print the boolean express age >= 16 to the console and note the results. 
		System.out.println(age >= 16);
		//change the value of age to 18 and run again. 
		age = 18;
		System.out.println(age >= 18);
		
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16 
		// and "you cannot dive" otherwise
		// change the value of age and rerun to see the result 
	  
		if (age >= 16){
			System.out.println("You can drve");
		}
		else {
			System.out.println("You cannot drive.");
		}
		
		age =18; 
		if (age >= 16){
			System.out.println("You can drve");
		}
		else {
			System.out.println("You cannot drive.");
		}
		
		
		//add a new variable called has license before the conditional 
		//change the boolean expression in the conditional to additionally include the need for haslicense to be be true
		//try changing the values of age and hasLicense and note the different results 
		boolean hasLicense = true; 
		if (age >= 16 && hasLicense){
			System.out.println("You can drve");
		}
		else {
			System.out.println("You cannot drive.");
		}
		
		hasLicense = false; 
		if (age >= 16 && hasLicense){
			System.out.println("You can drve");
		}
		else {
			System.out.println("You cannot drive.");
		}
		
		//create two new variables - costOfMilk and thirstLevel 
		//create a conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and note the different results 
		
		double costOfMilk = 3.00; 
		int thirstLevel = 7; 
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks");
		}
		
		costOfMilk = 3.00;
		thirstLevel = 4; 
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks");
		}
	
		
		//create two variables called numberOfCookies and numberOfChildresn
		//you will evenly distribute all of the cookies to the children and as the adult 
		//you get to keep the remaining cookies to yourself 
		//use a conditional to print the following based on the following conditions: 
		// if there are 0 cookies remaining ,print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Woohoooo!" 
		//if there are 5 or more cookies, print "Jackpot!" 
		
		int numberOfCookies = 7; 
		int numberOfChildren = 2; 
		
		if(numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}else if(numberOfCookies % numberOfChildren >=2 ) {
			System.out.println("Woohoo!");
		}else if(numberOfCookies % numberOfChildren  >0) {
			System.out.println("Yes!");
	}else {
			System.out.println("Sad Face!");
		}
		
		 numberOfCookies = 10; 
		 numberOfChildren = 4; 
		
		if(numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}else if(numberOfCookies % numberOfChildren >=2 ) {
			System.out.println("Woohoo!");
		}else if(numberOfCookies % numberOfChildren  >0) {
			System.out.println("Yes!");
	}else {
			System.out.println("Sad Face!");
		}
		
		 numberOfCookies = 10; 
		 numberOfChildren = 5; 
		
		if(numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}else if(numberOfCookies % numberOfChildren >=2 ) {
			System.out.println("Woohoo!");
		}else if(numberOfCookies % numberOfChildren  >0) {
			System.out.println("Yes!");
	}else {
			System.out.println("Sad Face!");
		}
		
		numberOfCookies = 20; 
		 numberOfChildren = 12; 
		
		if(numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}else if(numberOfCookies % numberOfChildren >=2 ) {
			System.out.println("Woohoo!");
		}else if(numberOfCookies % numberOfChildren  >0) {
			System.out.println("Yes!");
	}else {
			System.out.println("Sad Face!");
		}

		
		int remainingOfCookies = numberOfCookies % numberOfChildren; 
		
		if(remainingOfCookies >= 5) {
			System.out.println("Jackpot!");
		}else if(remainingOfCookies >=2 ) {
			System.out.println("Woohoo!");
		}else if(remainingOfCookies >0) {
			System.out.println("Yes!");
	}else {
			System.out.println("Sad Face!"); 
		}
	
	
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltymemberStatus scale 
		//"Silver" is 0.10, "Gold is 0.15 and Platinum" is 0.25
		
	String loyaltyMemberStatus = "GOLD"; 
	double loyaltyMemberDiscount = 0.12; 
	
	switch (loyaltyMemberStatus){
		case "SILVER":
			loyaltyMemberDiscount = .1; 
			break; 
		case "GOLD":
			loyaltyMemberDiscount = .15; 
			break; 
		case "PLATINUM": 
			loyaltyMemberDiscount = .25;
			break; 
			 
		} 
		System.out.println(loyaltyMemberDiscount); 
	
		//create a variable called billTotal and assign a value 
		//create a variable called adjustTotal and assign it to the billTotal minus the loyaltyMemberDiscoutn percent of the billTotal
		//if the adjustBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD  to PLATINUM
	
	
		double billTotal = 600; 
		double adjustedBillTotal = billTotal - loyaltyMemberDiscount * billTotal; 
		System.out.println(adjustedBillTotal);
		
		
		if (adjustedBillTotal > 500){
			if(loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD"; 
					
			}else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM"; 
			}
			
		}
		System.out.println(loyaltyMemberStatus);
		
		//create two variables, username and password 
		//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "1234"
		//otherwise, print "access denied" 
		
		String username = "Sammy123"; 
		String password = "12345"; 
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			 
			System.out.println("Login Successful");
			}else {
			System.out.println("Access Denied");
			}
		
		
		
		//write a for loop that prints each number from 0 to 9
		
		for (int i = 0;  i < 10; i++) {
			System.out.println(i);
		}
	
		//write a for loop that prints each number from 10 to 0 backwards 
		
		for(int s=10; s >= 0; s--) {
			System.out.println(s);
		}
		
		//write a for loop that prints every other number from 0 to 100 
		
		for(int i = 0; i <= 100; i+=2) { 
			System.out.println(i);
			
		}
		//itterates 100 digits 
		for(int i=0; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		
		//write a for loop that iterates from 0 to 100 and prints "Even" if the number is even and "Odd" if it's odd 
		
		for(int i=0; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.println(i+ " even");
			}else { 
			System.out.println(i + " odd");
		}
	}
		
		//write a while loop that starts at 100 and iterates backward by 1 unit it reaches 0 
		//dived each number by 3 and print the remainder to the console 
		int x = 100; 
		
		do {
			System.out.println(x + " " + (x % 3));
			x--;
			
		}while(x >=0); 
		
			
		int i = 100; 
		while (i >= 0) {
			System.out.println(i + " " + (i % 3)  );
			i--; 
		}
		
			
}

}

	


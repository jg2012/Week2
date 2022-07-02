
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

		
	}
	
}

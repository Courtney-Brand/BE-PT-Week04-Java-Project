package week04Project;

import java.util.List;

public class Week04JavaProject {

	public static void main(String[] args) {
		
		// Instantiate an array of int with prescribed values.
		int[ ] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// This accesses the last element in the array (located at arrayName.length - 1 because of zero based indexing) and the first element in the array (located at index 0). I included the 			logic in my print statement  for efficiency, rather than creating another variable.
		System.out.println(ages[ages.length -1] - ages[0]);
		
		// Instantiate an array of int with 9 elements.
		int [ ] ages2 = {5, 9, 29, 33, 36, 37, 38, 67, 68};
		
		// This is the same logic as the subtraction in the print statement for ages. The mathematical operation is the same due to the fact that the last element in an array can always be 			found by using the .length method and subtracting 1 to account for zero indexing. 
		System.out.println(ages2[ages2.length -1] - ages2[0]);
		
		// Created a variable to store the sum of all ages in preparation for performing more calculations. 
		int sum = 0;
		
		// for loop calculates average of ages2
		for (int i = 0; i < ages2.length; i++) {
		sum+= ages2[i];
		} int average = sum / ages2.length;
		
		//print average to the console
		System.out.println(average);
		
		// Create a string array with prescribed values.
		String[ ] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// For loop adds together the number of letters in all the words and divides by the number of 			words
		int letterTotal = 0;		
		for (String name : names) {
			letterTotal += name.length();
		} int averageNumberOfLetters = letterTotal / names.length;
		
		// Prints average number of letters to the console, rounds down as int variable type does not account for decimal places.
		System.out.println(averageNumberOfLetters);
		
		// Loop to concatenate names 
		String namesConcatenated = ("");
		for(String name: names) {
			namesConcatenated += (name + " ");
		} 
		
		// Prints a concatenated string of names to the console
		System.out.println(namesConcatenated);
		
		// To access the last element of an array use the syntax arrayName[arrayName.length -1] as this accounts for the first index in the array being 0.
		
		// To access the first element of an array use the syntax arrayName[0]
		
		// Created a new int array to store the lengths of each name in names. This loop iterates through every  index of the nameLengths array and store the value accessed by using the 		// .length method on each element of the names array.  I added a print statement so that I could see that the elements were being stored in the array correctly.
	
		int[ ] nameLengths =  new int [names.length] ;
		
		for (int index = 0; index <names.length; index++ ) {
			nameLengths [index] = names[index].length();
			System.out.println("element at index " + (index) + ": "+ nameLengths[index]);
		}
			
			//Loop to iterate over nameLengths array to find sum. This gets the int value from each element of nameLengths and adds them together, storing them in the variable 			//sumOfNames.
			int sumOfNames = 0;
			
			for(int naLn : nameLengths) {
				sumOfNames += naLn;
			} System.out.println(sumOfNames);
		
			// Testing method to concatenate a string to itself 
			String word = ("Bluey");
			int n = 5;
			String wordRepeat = concatenateWordRepeated(word, n);
			System.out.println(wordRepeat);
			
			// Testing method that takes variables firstName and lastName and concatinates them in to one string variable fullName
			String firstName = "Forest";
			String lastName = "Gump";
			String fullName = concatenateFullName(firstName, lastName);
			System.out.println(fullName);
			
			// Testing a method that calculates if the sum of all ints in an array is greater than 100
			int[ ] numbers = {15, 24, 32, 5, 76, 9, 29};
			boolean isSumBig = isSumOfIntGreaterThan100(numbers);
			System.out.println(isSumBig);
			
			// Testing a method that calculates the average of an array of double
			double[ ] prices = {1.99, 5.49, 2.68, 11.27, 6.81};
			double averagePrice = calculateAverageOfDoubleArray(prices);
			System.out.println(averagePrice);
			
			// Testing a method to compare the average of two arrays
			double [ ] mathScores = {80.5, 98.2, 91.3, 78.7, 65.4};
			double [ ] spellingScores = {88.6, 65.1, 94.6, 77.5, 86.5};
			boolean higherInMath = isFirstArraysAverageGreater(mathScores, spellingScores);
			System.out.println(higherInMath);
			
			// Testing logic that decides if the conditions are right for buying a drink
			boolean isHot = true;
			double cash = 20.33;
			boolean getLemonade = willBuyDrink(isHot, cash);
			System.out.println(getLemonade);
			
			// Testing my method to decide how many episodes of Bluey my kids can watch
			double time = 7.27;
			boolean peace = true;
			int blueys = numberOfBlueysTonight(time, peace);
			
			if (blueys > 0) {
			System.out.println("Yay! We can watch " + blueys + " Bluey(s) tonight!");
			} else {
				System.out.println("Sorry! We can't watch Bluey tonight. :(");
			}
			
}

		// My method to decide how many Episodes of Bluey my kids can watch. I created this so that the decision making for this reward system would be logical and consistent.
		public static int numberOfBlueysTonight (double timeReadyForBed, boolean noFighting) {
			int numberOfBlueys = 0;
			if (noFighting)  {
				if (timeReadyForBed <= 7.30) {
					numberOfBlueys = 3;
				} else if (timeReadyForBed > 7.30 && timeReadyForBed <= 7.40) {
					numberOfBlueys = 2;
				} else if (timeReadyForBed > 7.40 && timeReadyForBed <= 7.50) {
					numberOfBlueys = 1;
				}
			} else {
				numberOfBlueys = 0;
			} return numberOfBlueys;
		} 
	
	
		// Method takes in information about the conditions and returns a decision about purchasing a drink if both conditions are right
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && (moneyInPocket > 10.50)) {
				return true;
			} else {
				return false;
			}
		}
	
	
		//Method compares the average value of two arrays and returns a boolean value (true if the first array is greater, false if the second is greater
		public static boolean isFirstArraysAverageGreater (double [ ] array1, double[ ] array2) {
			double sum1 = 0;
			double sum2 = 0;
			
			for(double ar1 : array1) {
				sum1 += ar1;
			}
			for (double ar2 : array2) {
				sum2 += ar2;
			}
			double average1 = sum1 / array1.length;
			double average2 = sum2 / array2.length;
			if (average1 > average2) {
				return true;
			} else {
				return false;
			}
		}
		
		// Method calculates the average of an array of double by adding each element together and dividing by the number of elements
		public static double calculateAverageOfDoubleArray (double[ ] doubleArray) {
			double sum = 0;
			for (double dA : doubleArray) {
				sum += dA;
			} return sum / doubleArray.length;
		}
	
		// Method to calculate if sum of all ints in an array is greater than 100, loop adds all ints together then checks if the sum is greater than 100
		public static boolean isSumOfIntGreaterThan100 (int[] numbers) {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			} if (sum > 100) {
				return true;
			} else {
				return false;
			}
		}
	
		//Method to concatenate a first name and a last name in to a full name
		public static String concatenateFullName (String firstName, String lastName) {
			String fullName = (firstName + " " + lastName);
			return fullName;
		}
	
	
		// Method to concatenate strings, loop adds the word to itself the number of times specified in n. This forms a new string.
		public static String concatenateWordRepeated (String word, int n) {
			String repeatWord = (" ");
			for (int i = 0; i < n; i++) {
				repeatWord += (word);
			}
			return repeatWord;
	}
}

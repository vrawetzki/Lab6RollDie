
public class StringDemo {

	public static void main(String[] args) {
		
		String x = "hello";
		x = "hi"; // x is actually creating an entirely new memory location
		// to store hi, hello still exists in memory somewhere so this is not
		// the most efficient thing to do
		System.out.println(x);
		
		
		// creating an array below, [] distinguish between regular variables and arrays
		//  all items must be chars - use single quotes
		char[] arr = {'G', 'r', 'a', 'n', 'd'};
		String word = new String(arr);
		System.out.println(word);
		
		String sameWord = "Grand"; // same thing as above
		
		int num = 5; // to convert five to a string
		String five = num + ""; // now its an empty string
		System.out.println(five); // to cast number to string, to check against, use the empty quotes
		
		String hello = "Hello";
		hello = hello.concat(" World");
		System.out.println(hello);
		
		// same thing as above
		String hello2 = "Hello";
		hello2 += " World!";
		System.out.println(hello2);
		
		// to determine whether or not hello is equal or not to hello2
		boolean stringTester = !hello.equalsIgnoreCase(hello2);
		System.out.println(stringTester);
		
		
		
		
		Integer y = null; // all primitive types have parent wrapper types
		// regular primitive types cannot be assigned to null
		// only helpful when we need to start at a null value, or when working with databases
		// strings can be assigned to null
		
		boolean testY = y != null; 
		System.out.println(testY);
		// only use if comparing to null otherwise use the equalsignorecase
		
		
		System.out.println(hello.charAt(6));
		System.out.println(hello.endsWith("rld"));
		System.out.println(hello.indexOf("e")); // show 1 because we're starting at zero
		System.out.println(hello.lastIndexOf("o"));  
		
		
		
		String z = "A"; //index of strings is zero because theyre under the hood
		System.out.println(z.length());
		
		
		
		String wordLoop = "Java is cool!"; // for loop because we know when it starts and stops
		wordLoop = wordLoop.replace('l', 'p');
		for (int i = 0; i < wordLoop.length(); i++) {
			System.out.println(wordLoop.charAt(i));
		}
		
		
		// to replace the l's with p's from hello world from above
		System.out.println(hello.replace('l', 'p'));
		
	
	
		String wordToSplit = "Lunch is coming up!";
		String [] wordsSplit = wordToSplit.split(" "); // has to be double quotes
		for (int i = 0; i < wordsSplit.length; i++) {
			System.out.println(wordsSplit[i]); // to get access to the index
			// useful for capstone over the weekend
			
		}
		
		System.out.println(wordToSplit.substring(5));
		
		// to lowercase
		System.out.println(wordToSplit.toLowerCase());
		// to uppercase
		System.out.println(wordToSplit.toUpperCase());
		// trim method to remove trailing or leading white space
		// create variable
		String lotsOfSpace = "         y       ";
		System.out.println(lotsOfSpace);
		System.out.println(lotsOfSpace.trim());
		
		String test = "smiles";
		System.out.println(test.substring(1,5));
		// the last index is exclusive
		// the overloaded method endIndex is not inclusive!
		// if you wanted first letter substring(0)) if you wanted the last 's' substring(6))
		
		
		
		
	}
	
	
	
	
	
}

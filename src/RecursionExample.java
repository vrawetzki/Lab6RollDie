import java.util.Scanner;

public class RecursionExample {

	public static void main(String[] args) {
		
		// countdown timer
		// write method that calls itself
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userNum = scan.nextInt();
		// to call method 
		countDown(userNum);
		
		scan.close();
	}
	
	public static void countDown(int counter) {
		// get a number from user to use in method
		// print out numbers - void method
		// first think about where we want to stop - check end condition
		// if end condition is true - then it will quit
		// else perform the step (divide the problem into smaller chunk (method end)
		// we want to stop at a point
		// how to check if number is at zero
		if (counter == 0) {
			System.out.println("Go!");
			} else {
				System.out.println(counter);
				countDown(counter-1); 
				// because we want it to go down by one, call the number and move it down by one eachtime
				// this is recursion - a method calling itself
				// we are breaking it into smaller pieces by subtracting 1 each time the method is called
			}
		return; 
		// this is like a break - do not put anything after the return
	}

}

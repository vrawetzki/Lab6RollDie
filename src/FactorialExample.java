//
//public class FactorialExample {
//
//	public static void main(String[] args) {
//		// using methods for this
//		// 
//		System.out.println(getFact(4));
//	}
//	
//	public static long getFact(int num) {
//		long result = 1;
//		for (int i = 1; i <= num; i++) {
//			result *= i; //result = result*i
//			
//		}
//		return result;
//	}
//	// using long because you dont know how long the number will be
//	// because its a long we need a return 0
//	
//	//  
//	
//	
//}
//
//
//public class FactorialEx {
//
//	public static void main(String[] args) {
//		System.out.println(recursionFact(4));
//
//	}
//	
//	public static long getFact (int num) {		// long because number returned is unpredictably long
//		long result = 1; 							// takes int because number inputed is generally short
//		for (int i= 1; i <= num; i++) {		// starts at 1, not 0 because factorial could start at 1 and ends at 1
//			result *= i;
//			
//		}
//		return result;									
//	}
//	
//	// code challenge: factorial using recursion
//	public static long recursionFact (int num) {
//		// checks to make sure num isn't zero or negative
//		if (num <= 1) {
//			return 1;
//		}
//		return num*recursionFact(num-1);
//	}
//}
//		
//		
//		
//		
////		public static long getFactorial(int num) {
////			long result = 1;
////			for (int i = 1; i <=num; i++) {
////				result *=1
////			}
////			return result;
////		}
////		
////		// this is using recursion
////		public static long getFactorialRecursion(int num) {
////			if (num == 1 || num == 0) {
////				return 1;
////			}
////			return num * getFactorialRecursion(num -1);
////		}
////		
////	}
////}
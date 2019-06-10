
public class StringBuffBuild {
	
public static void main(String[] args) {
	// the benefit of using string buffer is that it makes strings mutable
	// meaning that we can change them
	// without hurting memory
//	StringBuffer sb = new StringBuffer("Hello World!");
//	sb.append(" I'm learning new stuff.");
//	sb.append(" Java is so cool!");
//	System.out.println(sb);
//	
//	// see the length
//	System.out.println(sb.length());
//	System.out.println(sb.reverse().toString().toLowerCase());
//	String test = sb.reverse().toString().toLowerCase();
//			
//	
//}
	
	// StringBuilder is newer, but has all the same methods as the buffer
	// StringBuilder is not thread safe, but StringBUffer is
	
StringBuilder sb = new StringBuilder("Hello World!");
sb.append(" I'm learning new stuff.");
sb.append(" Java is so cool!");
System.out.println(sb);

// see the length
System.out.println(sb.length());
System.out.println(sb.reverse().toString().toLowerCase());
String test = sb.reverse().toString().toLowerCase();
		
}

}
// string is any set of characters
// we define them by an array of characters, can declare them using them stringx="hello";
// or by char[] arr = {'g', 'r', 'a', 'n', 'd',};

// to join strings together
// add with + or with concate it
// cannot use ==
// charat will give us a value at a specific index
// making strings mutable, labs wont require this


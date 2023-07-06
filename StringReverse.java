package problems;
import java.lang.*;
import java.util.*;
public class StringReverse{
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eetr the string:");
		String s=sc.nextLine();
		str.append(s);
		System.out.println("The reversed string is:"+str.reverse());
//		Scanner sc = new Scanner(System.in);
//	    System.out.print("Enter String :");
//	    String s = sc.nextLine();
//	    char[] c = s.toCharArray(); 
//	    Arrays.sort(c);
//	    System.out.println(c);
	}
}
package problems;
import java.util.*;
public class check_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String str=sc.nextLine();
		System.out.println("Re-Enter the username:");
		String rstr=sc.nextLine();
		if(str.equals(rstr)) {
			System.out.println("correct");
		}
		else {
			System.out.println("Incorrect");
		}
		sc.close();
	}
}
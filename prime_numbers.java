package problems;
import java.util.*;
public class prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range of the numbers:");
		int n=sc.nextInt();
		int c;
		System.out.println("The prime numbers are:");
		for(int i=2;i<=n;i++)
		{
			c=0;
			for (int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}

package problems;
import java.util.*;
public class fibonacci_series {
	public static void main(String[] args) {
		int f=0,s=1,t,j=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of values:");
		int n=sc.nextInt();
		int a[]=new int[n];
		a[0]=f;
		a[1]=s;
		for(int i=2;i<a.length;i++) {
			t=f+s;
			f=s;
			s=t;
			a[i]=t;
		}
		System.out.println("The fibonaci series:"+Arrays.toString(a));//use loop for removing the braces
		for(j=0;j<n;j++) {
			if(j%2==0) {
				sum+=a[j];
			}
		}
		System.out.println("The sum of the even indices terms is:"+sum);
	}
}

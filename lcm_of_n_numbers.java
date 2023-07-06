package problems;

public class lcm_of_n_numbers {
	public static int gcd(int a,int b) {
		return b==0 ? a : gcd(b,a%b);
	}
	public static int lcm(int a,int b) {
		int l;
		return l=(a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		int a[]= {25,20,100};
		int l=1;
		for(int i=0;i<a.length;i++) {
			l=lcm(l,a[i]);
		}
		System.out.println("the lcm of the given array is:"+l);
		
	}
}

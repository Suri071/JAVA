package problems;
public class binary_search {
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid=(first+last)/2;
		while(first!=mid) {
			if(arr[mid]>key) {
				first=mid+1;
			}
			else if(arr[mid]<key) {
				last=mid-1;
			}
			else if(arr[mid]==key) {
				System.out.println("The searching number is at "+mid);
				break;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("The element is not found");
		}
	}
	public static void main(String[] args) {
		 int arr[] = {10,20,30,40,50};  
	     int key = 30;  
	     int last=arr.length-1;  
	     binarySearch(arr,0,last,key);  
	}
}

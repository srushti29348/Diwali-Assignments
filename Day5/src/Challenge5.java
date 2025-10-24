import java.util.Arrays;
import java.util.Scanner;
public class Challenge5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element:");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
			
		}
		System.out.println("Enter key:");
		int k=sc.nextInt();
		k=k%n;
		
		reverse(num,0,n-1);
		reverse(num,0,k-1);
		reverse(num,k,n-1);
		System.out.println("rotated Array:"+Arrays.toString(num));
		
	}
	public static void reverse(int[] arr,int start ,int end) {
		while(start<end) {
			int temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		
		}
	}

}

import java.util.Scanner;
public class Quest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of term sum u want:");
		int n=sc.nextInt();
		int sum=0;
	    int count=0;
	    int i=1;
	    while(count<n) {
	    	  if(i%2!=0) {
	    		  sum+=i;
	    		  count++;
	    	  }i++;
	    }
	    System.out.println("Sum is"+sum);
	}
}

import java.util.Scanner;
public class Challenge2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int reverse=0;
		int original=n;
		while(n!=0) {
		    int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		System.out.println(reverse);
	
	}
}
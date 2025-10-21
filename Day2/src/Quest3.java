import java.util.Scanner;
public class Quest3 {
	public static boolean palindrome(int n) {
		int reverse=0;
		int original=n;
		while(n!=0) {
		    int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		return reverse==original;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		boolean result=palindrome(n);
		System.out.println(result);
	}
}

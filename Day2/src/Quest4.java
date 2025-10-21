import java.util.Scanner;

public class Quest4 {
	public static boolean Armstrong(int n) {
		int sum=0;
		int original=n;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		return sum==original;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		if(Armstrong(n)) {
			System.out.println(n+" "+"is Armstrong Number");
		}
		else {
			System.out.println(n+" "+"is not a Armstrong Number");
		}

	}

}

import java.util.Scanner;
public class Quest5 {
	public static int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number to find GCD");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=gcd(n1,n2);
		System.out.println("GCD is:"+gcd);
		System.out.println("Lcm is"+(n1*n2)/gcd);

	}

}

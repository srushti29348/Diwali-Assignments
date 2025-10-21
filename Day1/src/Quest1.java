import java.util.Scanner;
public class Quest1 {
	private static boolean isprime(int n) {
		if(n<=2) {
			return false;
		}else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		System.out.println(isprime(n));
	}

	
}

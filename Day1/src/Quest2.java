import java.util.Scanner;
public class Quest2 {
	private static boolean isprime(int n) {
		if(n<=1) {
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
		for(int i=2;i<=n;i++) {
			if(isprime(i)) {
				System.out.println(i+" ");
			}
		}
	}

	
}

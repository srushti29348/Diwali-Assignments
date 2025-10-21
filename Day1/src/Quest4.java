import java.util.Scanner;

public class Quest4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of Terms Required in Fibnnoci series:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int temp=a+b;
			a=b;
			b=temp;
		}
	}
}

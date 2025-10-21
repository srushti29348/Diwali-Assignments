import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of even Number Sum u want");
		int n=sc.nextInt();
		int sum=0;
		int even=2;
		for(int i=1;i<=n;i++) {
			sum+=even;
			even+=2;
			}
		System.out.println("Sum of"+n+"Even Number is"+sum);

	}

}

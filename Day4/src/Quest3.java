import java.util.*;
public class Quest3{
    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("To Print Triangle Pattern");
	System.out.println("Enter Number Of Rows:");
	int r=sc.nextInt();
	for(int i=1;i<=r;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}

	
	System.out.println("To Print Pyramid Pattern");
	System.out.println("Enter Number Of Rows:");
	int r1=sc.nextInt();
	for(int i=1;i<=r1;i++) {
		for(int j=1;j<=r1-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print(k);
		}System.out.println();
		
	}

	}

}

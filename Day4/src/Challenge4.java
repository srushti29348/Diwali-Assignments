import java.util.Scanner;
public class Challenge4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {0,1,2,4,5,6,7};
		int n=arr.length;
		int total=n*(n+1)/2;
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
        int missing=total-sum;
        System.out.println("Missing Number is:"+missing);
	}

}

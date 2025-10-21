import java.util.Scanner;
public class Challenge1 {

	public static void main(String[] args) {
		String[] arr= {"hiii","hello","iet","institute"};
		String longest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>longest.length()) {
				longest=arr[i];
			}
		}
		System.out.println("Longest String in array is:"+longest);
	}
}

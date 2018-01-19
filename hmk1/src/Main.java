import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Accept 1st number");
		int a=sc.nextInt();
		System.out.println("Accept 2nd number");
		int b=sc.nextInt();
		
		range r=new range();
		ArrayList<Integer> numbers=r.numbersInRange(a, b);
		for(int i:numbers) {
			System.out.println(i);
		}

	}

}

import java.util.ArrayList;
import java.util.List;

public class range implements rangeInterface{
	/*
	 * Accepts two integers a and b
	 * Returns the even numbers within the range of a and b.
	 */
	public ArrayList<Integer> numbersInRange(int a, int b) {
			
		ArrayList<Integer> evenNumbers=new ArrayList<>();
		
		if(a==b)
		{
			return evenNumbers;
		}
		
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		

		for (int i=a;i<b-1; i++)
		{
			if((i+1)%2==0)
			 evenNumbers.add(i+1);
		}
		return evenNumbers;
		
		
	}
}	




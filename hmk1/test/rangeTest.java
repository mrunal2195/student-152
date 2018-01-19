import java.util.ArrayList;

import junit.framework.TestCase;



	public class rangeTest extends TestCase {
		
		public void test_1() {
			range r=new range();
			ArrayList<Integer> numbers = r.numbersInRange(2, 5);
		    ArrayList<Integer> expectedNumbers=new ArrayList<Integer>();
			expectedNumbers.add(3);
			
			assert(numbers.equals(expectedNumbers));
		}
		
		public void test_2() {
			range r=new range();
			ArrayList<Integer> numbers = r.numbersInRange(5, 2);
		    ArrayList<Integer> expectedNumbers=new ArrayList<Integer>();
		    expectedNumbers.add(2);
			
			assert(numbers.equals(expectedNumbers));
		}
		
		public void test_3() {
			range r=new range();
			ArrayList<Integer> numbers = r.numbersInRange(2, 2);
		    ArrayList<Integer> expectedNumbers=new ArrayList<Integer>();
		    assert(numbers.equals(expectedNumbers));
		}
		
		public void test_4() {
			range r=new range();
			ArrayList<Integer> numbers = r.numbersInRange(-6, -2);
		    ArrayList<Integer> expectedNumbers=new ArrayList<Integer>();
		    expectedNumbers.add(-4);
			assert(numbers.equals(expectedNumbers));
		}


	}



package day2Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6};
		Set<Integer> num1 = new TreeSet<Integer>();
		for(int i=0; i<=numbers.length-1;i++) {
			num1.add(numbers[i]);	
		}
		//System.out.println(numbers);
		List<Integer> num2 = new ArrayList<Integer>();
		num2.addAll(num1);
		System.out.println(num2);
		
		for(int i =0;i<num2.size()-1;i++) {
			
			/*why we using [i<num2.size()-1]-->get(7+1)-get(7)-->get(8)-get(7)
            -->so we are not going for upto i<=num2.size-1 that means it takes
			-->get(8+1)-get(8)-->get(9)-get(8)-->(9)index is not in the list,
			-->It throws exception OUT OF BOUND*/ 
			
			int missing = num2.get(i+1)-num2.get(i);
			
			/*for iteration i=0-->num2.get(i+1)-num2.get(i)->get(0+1)-get(0)->get(1)-get(0)
			  get(1)=2 ; get(0)=1 so-->get(1)-get(0)-->2-1=1 */
			
			/*for iteration i=3-->num2.get(i+1)-num2.get(i)-->get(3+1)-get(3)-->get(4)-get(3)
			  get(4)=6 ; get(3)=4 so-->get(4)-get(3)-->6-4=2 */
			
			if(missing!=1) {                         
				System.out.println("The Missing Number Is "+(num2.get(i+1)-1));
				
			/*(num2.get(i+1)-1)-->(num2.get(3+1)-1)
		      (num2.get(4)-1)-->get(4)=6 -->so(6-1)=5 */
			}   			
			}                                                                 
	}
}
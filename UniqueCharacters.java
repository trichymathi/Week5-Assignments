package day2Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacters {

	public static void main(String[] args) {
		String input = "babub";
		Set<Character> input2 = new LinkedHashSet<Character>();
		for(int i =0;i<=input.length()-1;i++) {
			char adding = input.charAt(i);
			System.out.println(adding);	
			input2.add(adding);
		}
		System.out.println(input2);
	}
}

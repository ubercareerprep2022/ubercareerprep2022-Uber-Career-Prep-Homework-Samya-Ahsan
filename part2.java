import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class part2 {
	public static boolean isStringPermutation(String s1, String s2) {
		//asdf, fsda == true
		//data structure: hashmap?, array
		int len = 0;
		if (s1.length() > s2.length())
			len = s2.length();
		else
			len = s1.length();
		char[] s1arr = s1.toCharArray();
		char[] s2arr = s2.toCharArray();

		Arrays.sort(s1arr);
		Arrays.sort(s2arr);

		for (int i = 0; i < len; i++) {
			if (s1arr[i] != s2arr[i])
				//System.out.println("False.");
				return false;
		}
		//System.out.println("True.");
		return true;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = reader.next();
		System.out.println("Enter another string: ");
		String s2 = reader.next();

		boolean isPerm = isStringPermutation(s1, s2);
		System.out.println("Permutation: " + isPerm);
		reader.close();
	}
}

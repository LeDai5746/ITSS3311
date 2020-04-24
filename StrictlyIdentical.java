/*
Enter 5 elements of list1: 1 2 3 4 5
Enter 5 elements of list2: 1 2 3 4 5
Two lists are strictly identical.
 */
import java.util.Scanner;

public class StrictlyIdentical {

	public static void main(String[] args) {
		//We create a scanner for each array.
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter 5 elements of list1: ");
		int list1[] = new int[5];
		//The arrays are declared as integer arrays of length 5. 
		//This for loop takes the next integer inputed and places it in the place of i, from 0 to 4 for the array of length 5.
		for (int i=0; i<5;i++) {
			list1[i]=input1.nextInt();
		}
		//Repeat for the second array.
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter 5 elements of list2: ");
		int list2[] = new int[5];
		for (int i=0; i<5;i++) {
			list2[i]=input2.nextInt();
		}
		//The method equals is called and the returned boolean placed into the boolean variable equals.
		boolean equals = equals(list1, list2);
		//If equals is true, we print strictly identical and if it returns false we print not strictly identical, then close the two scanners.
		if (equals)
			System.out.print("Two lists are strictly identical.");
		else
			System.out.print("Two lists are not strictly identical.");
		input1.close();
		input2.close();
	}
	public static boolean equals(int[] array1, int[] array2) {
		//We create a boolean variable equal and initialize it to true.
		boolean equal = true;
		//This for loop checks every index to see if the integer in array 1 is equal to its corresponding integer in array 2.
		//The loop continues until we reach the final integer or the value of equal is returned as false.
		for (int i=0;i<5 && equal == true;i++) {
			if (array1[i] == array2[i])
				equal = true;
			else
				equal = false;
		}
		//We return the variable equal as a boolean as the final output of the method.
		return equal;
		}
	
}

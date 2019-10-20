package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] string = new String[5];
		//2. print the third element in the array
				System.out.println(string[3]);
		//3. set the third element to a different value
				string[3] = "a different value";
		//4. print the third element again
				System.out.println(string[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
				for (int i = 0; i < string.length-1; i++) {
					string[i] = "a string of your choice";
				}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
				for (int i = 0; i < string.length-1; i++) {
					System.out.println(string[i]);
				}
		//7. make an array of 50 integers
				int[] integer = new int[50];
		//8. use a for loop to make every value of the integer array a random number
				Random randy = new Random(100);
				for (int i = 0; i < integer.length-1; i++) {
					integer[i] = randy.nextInt(); 
				}
		//9. without printing the entire array, print only the smallest number on the array
				int smallest = 0;
				for (int i = 0; i < integer.length-1; i++) {
					if(integer[i] < smallest) {
						smallest = integer[i];
					}
				}
				System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
				for (int i = 0; i < integer.length-1; i++) {
					System.out.println(integer[i]);
				}
		//11. print the largest number in the array.
				int largest = 0;
				for (int i = 0; i < integer.length-1; i++) {
					if(integer[i] > largest) {
						largest = integer[i];
					}
				}
				System.out.println(largest);
		//12. print only the last element in the array
				System.out.println(integer[integer.length-1]);
	}
}


package Array;

import java.util.Scanner;



public class Array1 {

	public static void main(String[] args) {

		
		int[] array = new int[5];
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Enter number :    ");
			array[i] = scanner.nextInt();
			System.out.println("array["+i+"]=== "+ array[i]);
		}
		
		max = array[0];
		min = array[0];
		
		for(int a=0; a<array.length; a++) {
			sum += array[a];
			
			if(max < array[a]) {
				max = array[a];
			}
			else if(min > array[a]) {
				min = array[a];
			}
			
		}
		
		System.out.println();
		System.out.println("min === "+min);
		System.out.println("max === "+max);
		System.out.println("sum = " + sum);
		
		
	}
}

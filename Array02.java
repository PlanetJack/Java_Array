package Array;
import java.util.Scanner;
public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[5];
	
		System.out.println("Enter Arr1 number :      ");
		for(int i=0; i<arr1.length; i++) {
			
			arr1[i] = sc.nextInt();		
		}
		
		System.out.println("Enter Arr2 number :      ");
		for(int i=0; i<arr2.length; i++) {
			
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.println();
		
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[arr3.length-1]-i;
			
			System.out.print(arr3[i]+ " ");
		}
		
		
//		int[] arr1 = {10,20,30,40,50};
//		int[] arr2 = {1,2,3,4,5};
	

		
		
		/*
		 * 사용자한테 갯수 제한없이 입력 받아서 구하기!
		 */
		
		
	}

}

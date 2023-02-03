package Array;

import java.util.Arrays;
import java.util.Random;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[25];

		Random random = new Random();

		for (int i = 0; i < 25; i++) {
			array[i] = random.nextInt(25) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;

				}
			}
		}
		for(int i = 0; i < 25; i++) {
//			System.out.print("array["s + i + "] : " + array[i]+ "      ");
			System.out.printf("%2d        ", array[i]);
			
			//한줄마다 나머지 값이 0,1,2,3,4로 떨어진다
			if(i % 5 == 4) {
				System.out.println(" ");
			}
		}
		
	}

}
//				for (int z = 5; z >= 1; z--) {
//					
//					if (z == 1) {
//						System.out.println("");
//					}

		

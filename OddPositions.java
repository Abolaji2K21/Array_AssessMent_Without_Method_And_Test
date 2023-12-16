import java.util.Scanner;
import java.util.Arrays;

	public class OddPositions{

		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
	System.out.println(" An Array Showing List Of Element In Odd Positons ");
	
		int[] array ;
		array = new int[6];

	System.out.println(" Enter Six Any Element Of Your Choice : ");

			for(int collect = 0; collect < array.length ; collect++){
				array[collect] = input.nextInt();
				}
			for(int collect = 0; collect <= array.length ; collect++){
				if (collect % 2 != 0){
		System.out.print(" Index  Of Number Is : " +  collect );
		System.out.println("  Element of the Array : " + array[collect]);

				}
	

			}
	

		}

	}
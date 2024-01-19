import java.util.Scanner;
import java.util.Arrays;

	public class ComputeTotal{
		public static void main(String... args){

		Scanner input = new Scanner(System.in);
	System.out.println("Enter Any Five Digit To So I Can Help You Compute The Sum ");

		int[] array = new int[5];
		int count = 0;

			for(int collect = 0; collect < array.length ; collect++){
			array[collect]= input.nextInt();
			count += array[collect];
			System.out.println(" The Cummulative Total In The array_Index " + collect  + " Is " + count );
			}
			System.out.println(" Also The Running Total Of Your Array_List = " + count );
		
		}


	}
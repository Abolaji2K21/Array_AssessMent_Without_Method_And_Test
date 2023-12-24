import java.util.Scanner;
import java.util.Arrays;
	public class LargestNumberInArray{

		public static void main(String... args){

		Scanner input = new Scanner(System.in);
		System.out.println( " ENTER ANY THREE NUMBER OF YOUR CHOICE : " );


		int[] array;
		array = new int[3];	
		int largest_Num = 0;

		
			for(int collect = 0; collect < array.length; collect++){
			array[collect] = input.nextInt(); 
				if (array[collect] > largest_Num ){
					largest_Num = array[collect];
				}
			}
		
		System.out.println("The Highest Number Amongst All Three Choice From User Input is thus : " + largest_Num  );

		}
	}
import java.util.Scanner;
import java.util.Arrays;

	public class ReverseList{
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any Integer Of Your Choice So I Can Help You With The Reverse ");


		int[] array;
		array = new int[5];
		
			for(int collect = 0; collect < array.length ; collect++){
			array[collect] = input.nextInt();
			}
		int[] reverse;
		reverse = new int[5];
		int count = 0;

		for(int collect = array.length - 1; collect >= 0; collect--){
				reverse[count] = array[collect];
			count++;

		  }
	
		System.out.println("Your Reverse Integer is thus : " + Arrays.toString(reverse));


		}
	
	}
import java.util.Scanner;
import java.util.Arrays;
	public class ComputingSumAgain{

		public static void main(String... args){
		Scanner input = new Scanner(System.in);
	System.out.println("I Will Be Helping You With Computing The Sum Of Numbers Using A For_Loop A While_Loop A Do While_Loop ");
	System.out.println();


		int[] array;
		array = new int[3];
		int sum = 0;

			for(int collect = 0; collect < array.length; collect++){
			System.out.print("Oya Enter Any Integers Of Your Choice : " );
			array[collect] = input.nextInt();
			sum += array[collect];
			}
			System.out.println();
			System.out.println("Here's Is The Total Sum Of User Input Using For_Loop :" + sum);
	
			System.out.println();
	System.out.println("I Will Be Helping You With Computing The Sum Of Numbers Using A For_Loop A While_Loop A Do While_Loop ");
			System.out.println();

			int[] array2;
			array2 = new int[3];
			int sum2 = 0;
			int collect = 0;
			while(collect < array2.length){
			System.out.print("Oya Enter Any Integers Of Your Choice : " );
			array2[collect] = input.nextInt();
			sum2 += array2[collect];
			collect ++;
			}
			System.out.println();
			System.out.println("Here's Is The Total Sum Of User Input Using While_Loop :" + sum2);


			System.out.println();
	System.out.println("I Will Be Helping You With Computing The Sum Of Numbers Using A For_Loop A While_Loop A Do While_Loop ");
			System.out.println();

			int[] array3;
			array3 = new int[3];
			int sum3 = 0;
			int count = 0;

			do{
			System.out.print("Oya Enter Any Integers Of Your Choice : " );
			array3[count] = input.nextInt();
				sum3 += array3[count];
				count++;
			} while(count < array3.length);
			System.out.println();
			System.out.println("Here's Is The Total Sum Of User Input Using Do_While_Loop :" + sum3);
			

		}
	}
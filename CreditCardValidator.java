import java.util.Scanner;
	import java.util.Arrays;
	
public class CreditCardValidator{
	public static void main(String args[]){
	
  System.out.println("I WILL BE HELPING YOU CHECK YOUR CREDIT CARD VALIDITY STATUS ");
		System.out.println();
		
		Scanner input = new Scanner(System.in);
	
		int[] array;
		array = new int[16];
		int count = 0;
		
			System.out.print("Please Enter A Valid 16 Digit Integer : " );
				if (!input.hasNextInt()){
			System.out.print("Please Enter A Valid 16 Digit Integer : " );
				} else {
			array[count] = input.nextInt();

				}

		for(count = 0; count < array.length; count++){

		}

	}

}
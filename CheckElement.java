import java.util.Scanner;
import java.util.Arrays;

	public class CheckElement{
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
	System.out.println("Checking To See Whether An Element Occurs In A List ");

		int[] array;
		array = new int[3];

			for(int collect = 0; collect < array.length; collect++){
				array[collect] = input.nextInt();
			}

		
	System.out.println(" Enter Another Element So As To Complete A Check ");
			int compared_Variables = input.nextInt();
			int array_Index = 0;

		for(int collect = 0; collect < array.length; collect++){
			if(array[collect] == compared_Variables){
			array_Index = collect;
			break;
			}
		}

			if (array_Index != 0){
            System.out.println("The Number Entered Is Present In the Array Index " + array_Index );
			} else {
            System.out.println("The Number Entered Is Not Present In the Array Index " );
			}

	}

}
import java.util.Scanner;

public class CodeToCheckSecondLargest {
    private static Scanner input = new Scanner(System.in);
    private static int[] array = new int[5];
    private static int highestNumber = Integer.MIN_VALUE; 
    private static int secondHighestNumber = Integer.MIN_VALUE; 

    public static void main(String... args) {

        System.out.println("I Will Be Helping You Decide The Two Largest Input ");

        for (int collect = 0; collect < array.length; collect++) {
            System.out.print("Kindly Enter Integer# " + (collect + 1) + " : ");
            array[collect] = input.nextInt();

            if (array[collect] > highestNumber) {
                secondHighestNumber = highestNumber; 
                highestNumber = array[collect];

            } else if (array[collect] > secondHighestNumber) {
                secondHighestNumber = array[collect];

            }
        }

        System.out.println("The Largest Num: " + highestNumber);
        System.out.println("The Second Largest Num: " + secondHighestNumber);
    }
}

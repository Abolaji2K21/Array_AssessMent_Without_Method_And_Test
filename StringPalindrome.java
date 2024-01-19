import java.util.Scanner;
import java.util.Arrays;

	public class StPalindrome{
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
	System.out.println("Oya My Fans I Will Be Helping You With Word Palindrome Check");
        System.out.print("Enter a word: ");

			String [] array;
			array = new String[1];
			String reverse = "";

      			String userInput = input.next().toLowerCase();

        		for (int collect = userInput.length() - 1; collect >= 0; collect--) {
            			array[0] = userInput.charAt(collect);
           			 reverse = reverse + array[0];

			 
			}


			 if (array[0].equals(reverse)) {
            		System.out.println("it is a palindrome");
       			 } else {
          		System.out.println("it is not a palindrome");
        		}
		}

	}
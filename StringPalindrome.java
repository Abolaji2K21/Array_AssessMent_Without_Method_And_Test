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

			for(int collect = array[0].length() - 1; collect>= 0; collect--){
			array[collect]= input.next();
            		reverse = reverse + array[0].charAt(collect);

			 
			}


			 if (array[0].equals(reverse)) {
            		System.out.println("it is a palindrome");
       			 } else {
          		System.out.println("it is not a palindrome");
        		}
		}

	}
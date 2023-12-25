import java.util.Scanner;

public class CreditCardValidator {
    private static String fullName;
    private static String cardDetails;
    private static char[] cardDetail_s;
    private static String cardType;
    private static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Hello, Kindly Enter Your Full Name: ");
        fullName = input.nextLine();
        System.out.println();

        System.out.println("Hello, " + fullName + " Kindly Enter Your Card Details To Verify ");

        while (true) {
            cardDetails = input.nextLine();
            cardDetail_s = cardDetails.toCharArray();
            int sum = 0;

            System.out.println();

            if (cardDetails.length() != 13 && cardDetails.length() != 16) {
                System.out.println("Card number is invalid. Please Enter A Valid Card Number");
                continue;
            }

            System.out.println("Card number is valid.");

            int total = 0;
            int digit;
            int doubleDigit;

            for (int count = cardDetails.length() - 1; count >= 0; count--) {
                digit = Character.getNumericValue(cardDetail_s[count]);
                doubleDigit = 0;

                if (count % 2 == 1) {
                    doubleDigit = digit * 2;
                    if (doubleDigit > 9) {
                        doubleDigit = doubleDigit - 9;
                    }
                } else {
                    doubleDigit = digit;
                }

                total += doubleDigit;
            }

            if (total % 10 == 0) {
                switch (cardDetails.charAt(0)) {
                    case '4':
                        cardType = "Visa Card";
                        break;
                    case '5':
                        cardType = "MasterCard";
                        break;
                    case '6':
                        cardType = "Discover Card";
                        break;
                    case '3':
                        cardType = "American Express Card";
                        break;
                    default:
                        cardType = "Unknown Card Type";
                }

                System.out.println("******************************************");
                System.out.println("Credit Card Type: " + cardType);
                System.out.println("Credit Card Number: " + cardDetails);
                System.out.println("Credit Card Number Length: " + cardDetails.length());
                System.out.println("Credit Card Validity: Valid ");
                System.out.println("******************************************");
                break; 
            } else {
                System.out.println("******************************************");
                System.out.println("Credit Card Type: Invalid Card Type");
                System.out.println("Credit Card Number: " + cardDetails);
                System.out.println("Credit Card Number Length: " + cardDetails.length());
                System.out.println("Credit Card Validity: Invalid");
                System.out.println("******************************************");
                continue; 
            }
        }
    }
}

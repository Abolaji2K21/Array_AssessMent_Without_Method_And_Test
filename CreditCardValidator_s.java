import java.util.Scanner;

public class CreditCardValidator_s{

     public static void main(String... args){

	while(true){

        	String cardNumber = getCardDetails();
		if (cardNumber.equals("-1")){

            System.out.println("**************************************************");
            System.out.println("Thank You For Using The Program . ");
            System.out.println("**************************************************");
			break;

		}

        if (cardNumber.length() != 16 && cardNumber.length() != 13) {
            System.out.println("**************************************************");
            System.out.println("Invalid card number format.");
            System.out.println("**Credit Card Type: Invalid card number "  );
            System.out.println("**Credit Card Number: " + cardNumber);
            System.out.println("**Credit Card Digit Length: " + cardNumber.length());
            System.out.println("**Credit Card Validity Status: Invalid");
            System.out.println("**************************************************");

   
	}

        String cardType = getCardType(cardNumber);

        if (validateCard(cardNumber)) {
            System.out.println("**************************************************");
            System.out.println("**Credit Card Type: " + cardType);
            System.out.println("**Credit Card Number: " + cardNumber);
            System.out.println("**Credit Card Digit Length: " + cardNumber.length());
            System.out.println("**Credit Card Validity Status: Valid");
            System.out.println("**************************************************");

        } else {
            System.out.println("**************************************************");
            System.out.println("**Credit Card Type: " + cardType);
            System.out.println("**Credit Card Number: " + cardNumber);
            System.out.println("**Credit Card Digit Length: " + cardNumber.length());
            System.out.println("**Credit Card Validity Status: Invalid");
            System.out.println("**************************************************");

        }

    }


}
    
    public static String getCardDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify: And -1 To Quit the Programm.");
	String cardDetails = input.nextLine();
        return cardDetails;
    }

     public static boolean validateCard(String cardNumber) {
        int sum = 0;
        boolean calculate = false;

        for (int count = cardNumber.length() - 1; count >= 0; count--) {
            int digit = Character.getNumericValue(cardNumber.charAt(count));

            if (calculate) {
                digit = digit + digit;
                if (digit > 9) {
                    digit = digit - 9;
                }
            }

            sum += digit;
            calculate = !calculate;
        }

        return sum % 10 == 0;
    }

    public static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa Cards";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")){
	    return "American Express Cards";
	} else if (cardNumber.startsWith("6")){
	    return "Discover Cards";
	} else {
        return "Unknown Card";
    	}
    }
  
}
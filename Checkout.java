import java.util.*;


public class Checkout {

		private static long phoneNum ;
		private static String fullName;
    		private static String CashierName;
		private static double discount;
   		private static double amountPaid;
    private static ArrayList<String> itemList = new ArrayList<>();
    private static ArrayList<Integer> quantiyList = new ArrayList<>();
    private static ArrayList<Double> priceList = new ArrayList<>();
    private static ArrayList<Double> totalList = new ArrayList<>();


	private static Scanner input = new Scanner(System.in);



    public static void main(String... bj) {
	      	System.out.print("What Is The Customer's Name : " );
		fullName = input.nextLine();	
	 	System.out.println();
	
	 System.out.print("Welcome " + getFullName(fullName) + " Kindly Enter Your Phone Number  : " );
		phoneNum = input.nextLong();
	 	System.out.println();


		getItemList();
		getQuantity();
		getPrice();
		
		while(true){
            	System.out.println("Add More Items? ");
	    	System.out.println();
            	String addMore = input.next();
	    	System.out.println();
            		if (addMore.equalsIgnoreCase("no")) {
                	break;
            		}
		getItemList();
		getQuantity();
		getPrice();
		}

	      	System.out.println("Enter Cashier's Name : " );
	 	System.out.println();
		CashierName = input.next();
	 	System.out.println();

	      	System.out.println("How Much Discount Will He Get : " );
	 	System.out.println();
		discount = input.nextInt();
	 	System.out.println();

		for(int index=0; index < itemList.size(); index++){
		totalList.add(quantiyList.get(index) * priceList.get(index));
		}

		getDisplayAll();
		getDisplayAllWithPayment();

		

		System.out.println("How Much Did The Customer Give To You : ");
   		System.out.println();
    		amountPaid = input.nextDouble();
   	 	System.out.println();

    		while (amountPaid < getBillTotal()) {
        	System.out.println("Amount paid is less than the bill total. Please enter a valid amount.");
        	System.out.println("How Much Did The Customer Give To You : ");
        	System.out.println();
        	amountPaid = input.nextDouble();
        	System.out.println();
    		}	
			getDisplayAll();
		getDisplayForAfterPayment_s();



    }

    public static void getDisplayAll() {
    System.out.println();
    System.out.println("SEMI-COLON STORES");
    System.out.println();
    System.out.println("MAIN BRANCH");
    System.out.println();
    System.out.println("LOCATION : 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.");
    System.out.println();
    System.out.println("TEL :" + getPhoneNum(phoneNum));
    System.out.println();
    System.out.println("DATE :" + getCurrentDateTime());
    System.out.println();
    System.out.println("Customer Name:" + getFullName(fullName));
    System.out.println();
    System.out.println("Cashier's Name:" + getCashierName(CashierName));
    System.out.println();
    System.out.println("===============================================================");
    System.out.println();

    System.out.printf("%10s%10s%15s%15s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.println();

    System.out.println("--------------------------------------------------------------");

    for (int count = 0; count < itemList.size(); count++) {
        System.out.printf("%10s%10s%15s%15s", itemList.get(count), quantiyList.get(count),
                priceList.get(count), quantiyList.get(count) * priceList.get(count));

        System.out.println();
    }

    System.out.println("--------------------------------------------------------------");
    System.out.printf("%45s%.2f%n", "SubTotal :", getSubTotal());
    System.out.printf("%45s%.2f%n", "Discount :", getDiscount());
    System.out.printf("%45s%.2f%n", "VAT @ 7.50% :", getVAT());

    System.out.println("===============================================================");
    System.out.println();

    System.out.printf("%45s%.2f%n", "Bill Total :", getBillTotal());
 
    }

    public static void getDisplayAllWithPayment(){

    System.out.println("===============================================================");
    System.out.println();

    System.out.printf("%20s%.2f%n", "THIS IS NOT A RECEIPT KINDLY PAY ", getBillTotal());
    System.out.println("===============================================================");

    }

    public static String getFullName(String fullName){
	 	return fullName;
    }

    private static String getCurrentDateTime() {
        Date date = new Date();
        return date.toString();

    }

    private static long getPhoneNum(long phoneNum){
		return phoneNum;
    }

    private static String getCashierName(String CashierName){
		return CashierName;
    }
    private static int getdiscount(int discount){
		return discount;
    }

   

    private static void getItemList() {
            System.out.println("What Did The User Buy ");
	    System.out.println();
            String item = input.next();
	    System.out.println();

            itemList.add(item);
    }
  
    private static void getQuantity(){
	    System.out.println("How Many Pieces ? ");
	    System.out.println();
            int quantity = input.nextInt();
	    System.out.println();
	
	    quantiyList.add(quantity);

    }

    private static void getPrice(){
	    System.out.println("How Much Per Unit ? ");
	    System.out.println();
            double price = input.nextDouble();
	    System.out.println();
 
	    priceList.add(price);

    }   
   
    private static double getSubTotal() {
        double subTotal = 0;
        for (int counter = 0; counter < totalList.size() ; counter++) {
            subTotal += totalList.get(counter);
        }
        return subTotal;

    }


    private static double getDiscount(){
	return (getSubTotal() * (discount / 100));

    }
    private static double getVAT() {
        return (getSubTotal() * (7.50 / 100));
    }

    private static double getBillTotal(){
	 return (getSubTotal() - getDiscount() + getVAT());
   }

   private static double getBalance(){
	return (amountPaid - getBillTotal());
   } 
   
   public static void getDisplayForAfterPayment_s(){


    System.out.println("===============================================================");
    System.out.println();

    System.out.printf("%45s%.2f%n", "Bill Total :", getBillTotal());
    System.out.printf("%45s%.2f%n", "Amount Paid :", amountPaid);
    System.out.printf("%45s%.2f%n", "Balance :", getBalance());

    System.out.println("===============================================================");
    System.out.println("	Thank You For Your Patronage 		");
    System.out.println("===============================================================");  
   }
}




import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hrishi
 */
public class GroseryList {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        double budget;
        String product;
        String quantity;
        double price;
        double totalLeft;
        final ArrayList<String> pArray = new ArrayList<String>();
        final ArrayList<String> qArray= new ArrayList<String>();
        final ArrayList<Double> priceArray= new ArrayList<Double>();
        System.out.println("Enter Your budget: ");
        budget = input.nextDouble();
        totalLeft=budget;
        do {
            System.out.println("\n");
            System.out.println("1.  Add an Item:");
            System.out.println("2.  Exit");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter Product :");
                product = input.next();          
                System.out.println("Enter Quantity :");
                quantity = input.next(); 
                System.out.println("Enter Price :");
                price = input.nextDouble();               
                if(price > totalLeft){
                    System.out.println("Can't Buy the product ###(because budget left is: " + totalLeft);
                }else{
                    totalLeft = budget - price;
                    pArray.add(product);
                    qArray.add(quantity);
                    priceArray.add(price);
                    System.out.println("Amount Left :" + totalLeft);
                }
            } else if (choice == 2) {
                System.out.println("GROCERY LIST is:");
                System.out.println("Product Name\tQuantity\tPrice");
                for(int i=0;i<pArray.size();i++){
                    String product_value= pArray.get(i);
                    String quantity_value= qArray.get(i);
                    Double price_value= priceArray.get(i);
                    System.out.println(product_value+"\t\t"+quantity_value+"\t\t"+price_value);                
                }
                break;
            } else {
                System.out.println("Invalid Choice ");
            }
        } while (choice > 0);
    }
}

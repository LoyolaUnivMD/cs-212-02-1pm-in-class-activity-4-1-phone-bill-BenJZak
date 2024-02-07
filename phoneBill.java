// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

import java.text.DecimalFormat;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        double gbUsed = 0;
        double totalOwed = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner numScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("--------------------------");
        System.out.println("Package Green: For $49.99/month, 2GB of data is provided. Additional GB are $15/GB. \n" +
                "Package Blue: For $70/month, 4GB of data is provided. Additional GB are $10/GB.\n" +
                "Package Purple: For $99.95/month, unlimited data is provided.");
        System.out.println("--------------------------");
        System.out.println("Pick your package. Enter 'green', 'blue', or 'purple': ");
        String choice = scanner.nextLine();

        if(choice.equals("green")){
            System.out.println("How much data did you use (in gb): ");
            gbUsed = numScanner.nextDouble();
            System.out.println("Do you have a coupon? (y/n): ");
            boolean hasCoupon = false;
            if(scanner.nextLine().equals("y")){
                hasCoupon = true;
            }
            if(gbUsed > 2) {
                totalOwed += gbUsed * 15;
            }
            totalOwed += 49.99;
            if(hasCoupon) {
                if(totalOwed >= 75){
                    totalOwed -= 20;
                }
            }
            System.out.println("The total you owe this month is: " + df.format(totalOwed));
        } else if (choice.equals("blue")) {
            System.out.println("How much data did you use (in gb): ");
            gbUsed = numScanner.nextDouble();
            if(gbUsed > 4) {
                totalOwed += gbUsed * 10;
            }
            totalOwed += 70;
            System.out.println("The total you owe this month is: " + df.format(totalOwed));
        } else if (choice.equals("purple")) {
            System.out.println("You owe $99.95 this month.");
        } else {
            System.out.println("Invalid Input.");
        }
    }
}

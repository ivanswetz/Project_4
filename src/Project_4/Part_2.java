package Project_4;

import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, input a string:");
        String line = scan.nextLine();
        System.out.println(line.toUpperCase());
        for(int i = 0; ;i++){
            System.out.println("Do you want to continue? \n Input Y/N");
            String choice = scan.nextLine();
            if(choice.equals("Y") || choice.equals("y")){
                System.out.println("Hello, input a string:");
                line = scan.nextLine();
                System.out.println(line.toUpperCase());
            } else if (choice.equals("N") || choice.equals("n")) {
                System.out.println("Thanks for using the app!");
                break;
            }
            else{
                System.out.println("Wrong letter, shutting down...");
                break;
            }
        }
    }
}
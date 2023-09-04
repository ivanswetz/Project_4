package Project_4;

import java.util.Scanner;

public class Part_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, input string");
        String line = scan.nextLine();
        for(int i = line.length() -1 ; i >= 0; i--){
            System.out.print(line.charAt(i));
        }
        System.out.println();
        for(int i = 0; ;i++){
            System.out.println("Do you want to continue?");
            String choice = scan.nextLine();
            if(choice.equals("Y") || choice.equals("y")){
                System.out.println("Enter again");
                line = scan.nextLine();
                for(int j = line.length() -1 ; j >= 0; j--){
                    System.out.print(line.charAt(j));
                }
                System.out.println();
            } else if (choice.equals("N") || choice.equals("n")) {
                System.out.println("Thanks for using program!");
                break;
            }
            else{
                System.out.println("Wrong value, shutting down...");
                break;
            }
        }
    }
}

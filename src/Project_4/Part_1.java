package Project_4;

public class Part_1 {
    public static void main(String[] args){
        /*while(true){
            System.out.println("lol");
            break;
        }
        do{
            System.out.println("lol");
        }while(false);

        for (int i = 0; i < 10; i++){
            System.out.println("lol");
        }*/
        for(int i = 1; i<=10; i++){
            System.out.print(i);
        }
        for(int i = 10; i>0; i--){
            System.out.print(i);
        }
        System.out.println();
        String line = "hello";
        for (int i = 0; i < line.length(); i++){
            System.out.println(line.charAt(i));
        }
        for (int i = 0; i<10; i++){
            System.out.println();
            for(int j = 0; j<10; j++){
                System.out.print("*");
            }
        }
    }
}

import java.util.Scanner;
// importing Scanner

public class scanner {

    public static void main(String[] args) {
 /*

Scanner

*/
        System.out.println("Guess the number tra:");
        System.out.println("9");
        System.out.println("2");
        System.out.println("7");
        System.out.println("1");

        int nine = 9;
        int two = 2;
        int seven = 7;
        int one = 1;

        Scanner Scan = new Scanner(System.in);
        int imputUser = Scan.nextInt();

        while(!(imputUser == two)){
            System.out.println("Try Again!");
            imputUser = Scan.nextInt();
        }else{
            System.out.println("You're guess the number");
        }


    }

}

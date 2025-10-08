
import java.util.Scanner;

public class SwapDemo {


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int first_number;
        int second_number;
        System.out.println("Firt Number : ");
        first_number = scanner.nextInt();
         
        System.out.println("Second Number : ");
        second_number = scanner.nextInt();
        System.out.println("Before Being Replaced");
        
        System.out.println("First Number : " + first_number + "Second Number : " + second_number);
        int temporary = first_number;
        first_number = second_number;
        second_number = temporary;
        System.out.println("After Being Replaced");
        
        System.out.println("First Number : " + first_number + "Second Number : " + second_number);
    }
    
}

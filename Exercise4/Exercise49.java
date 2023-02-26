
import java.util.Scanner;
public class Exercise49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = scan.nextInt();
        if (x > 0) {
            System.out.println("Positive Number");
        }
        else {
            if (x < 0) {
                System.out.println("Negative Number");
            }
            else {
                System.out.println("Zero");
            }
        }
    }
}

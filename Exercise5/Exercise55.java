
import java.util.Scanner;
public class Exercise55 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter x");
            int x = scan.nextInt();
            System.out.println("Enter y");
            int y = scan.nextInt();
            System.out.println("Enter z");
            int z = scan.nextInt();
            if (x > y) {
                if (x > z)
                System.out.println("x is greater than y and z");
                else {
                    System.out.println("x is greater that y but is less then z");
                }
            }
                else {
                System.out.println("x is less than y");
            }
    }
}

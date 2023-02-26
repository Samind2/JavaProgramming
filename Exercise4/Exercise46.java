import java.util.Scanner;
public class Exercise46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = scan.nextInt();
        int y = (x*x)+(2*x)+10;
        System.out.println( y );
    }
}

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1");
        int n1 = scan.nextInt();
        System.out.println("Enter 2");
        int n2 = scan.nextInt();
        System.out.println("Enter 3");
        int n3 = scan.nextInt();
        System.out.println("Enter 4");
        int n4 = scan.nextInt();
        System.out.println("Enter 5");
        int n5 = scan.nextInt();
        int max = n1;
        if (max < n2) {
            max = n2;
        }
        if (max < n3) {
            max = n3;
        }
        if (max < n4) {
            max = n4;
        }
        if (max < n5) {
            max = n5;
        }
        System.out.println("The maximum value is" + max);
    }
}
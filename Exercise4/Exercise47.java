import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a");
        a = scan.nextInt();
        System.out.println("Enter b");
        b = scan.nextInt();
        if (a>b){
            System.out.println("a มากกว่า b");
        }
        else {
            if(a<b) {
                System.out.println("b มากกว่า a");
            }
            else {
                System.out.println("a เท่ากับ b");
            }
        }
    }
}
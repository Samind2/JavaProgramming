import java.util.Scanner;
public class Exercise43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number of products");
        int n = scan.nextInt();
        System.out.println("Enter Price");
        int x = scan.nextInt();
        int result = n * x;
        System.out.println(result +"บาท");
    }
}

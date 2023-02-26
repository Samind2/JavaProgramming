import java.util.Scanner;
public class Exercise45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ค่าความกว้าง ");
        int W = scan.nextInt();
        System.out.println("ค่าความยาว ");
        int L = scan.nextInt();
        int area = W * L ;
        System.out.println( area );
    }
}

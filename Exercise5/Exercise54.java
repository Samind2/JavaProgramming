import java.util.Scanner;

public class Exercise54 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter minute");
            int minute = scan.nextInt();
            if (minute <= 2) {
                 minute = 10+(minute - 2) *2;
                 System.out.println("Pay" +minute );
            }
            else {
                 minute = minute*5;
                 System.out.println("Pay" +minute );
            }
        }
}

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Decimal 2 digits 1st digit");
        float Frist = input.nextFloat();
        System.out.println("Enter Decimal 2 digits 2st digit");
        float Second = input.nextFloat();
        float output = (Frist-Second)*(Frist+Second);
        System.out.println(" ( "+Frist+" - "+Second+" )"+"( "+Frist+" + "+Second+" ) "+" = "+output);
    }
}


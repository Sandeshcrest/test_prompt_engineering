
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        double pay;
        double savings;

        Scanner sc = new Scanner(System.in);

        System.out.println("This is a program to calculate savings");
        System.out.println("Enter your pay");
        pay = sc.nextDouble();

        savings=0.10*pay;

        System.out.println("The savings are "+savings);

    }

    
}

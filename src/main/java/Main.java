/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        System.out.print("Please enter your name: ");
        Scanner in = new Scanner(System.in);
        String a = in.next();

        if (a.equalsIgnoreCase("Alice")) {
            System.out.println("Hello Alice");
        } else if (a.equalsIgnoreCase("Bob")){
            System.out.println("Hello Bob");

        }

    }
}
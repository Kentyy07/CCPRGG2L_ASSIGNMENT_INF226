package MyWork;
import java.util.Scanner;
public class Cooking {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        practice("Driving");
        scan.close();
    }

    static void practice(String drive) {

        System.out.println("Very Good!");
        test(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fix(drive);

            // Recursive call
            practice(drive);
        } else if (feedback.equals("yes")) {
            per(drive);
        }
    }

    static void test(String drive) {
        System.out.println("Go on Drive");
    }

    static String getFeedBack(String drive) {
        System.out.println("Is " + drive + " safe? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fix(String drive) {
        System.out.print("Enter additional skills:");
        scan.nextLine();
        
        String skills = scan.next();
        System.out.println("Practice Driving. Added " + skills);
    }

    static void per(String drive) {
        System.out.println("Go on " + drive);
    }

}

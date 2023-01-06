package MyWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email address: ");
        String studentEm = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w*\\@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEm);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }

 //num   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student phone number: ");
        String studentPhnum = scan.nextLine();

        Pattern patt = Pattern.compile("\\+63+\\d{10}");
        Matcher matt = pattern.matcher(studentEm);
        
        boolean mats = matcher.matches();

        if (mats) {
            System.out.println("valid student phone number");
        } else {
            System.out.println("invalid student phone number");
        }
//datee
Scanner scans = new Scanner(System.in);
System.out.print("Enter student birthday: ");
String studentDate = scan.nextLine();

Pattern patts = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
Matcher matts = pattern.matcher(studentDate);

boolean matss = matcher.matches();

if (matss) {
    System.out.println("valid student birthday");
} else {
    System.out.println("invalid student birthday");
}

    }
}
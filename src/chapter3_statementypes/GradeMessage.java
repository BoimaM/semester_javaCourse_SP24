package chapter3_statementypes;
import java.util.Scanner;
/*
Switch Statements
 */

public class GradeMessage {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your letter grade:");
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message ="Error, invalid grade";
                break;
        }
        System.out.println(message);
    }
}

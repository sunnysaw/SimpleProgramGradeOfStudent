/*
Question : Write a program to read grade and display a equivalent description
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE GRADE OF STUDENT :");
        int a = sc.nextInt();
        System.out.println("PRINTING THE RESULT :");
        if (a >= 90) {
            System.out.println("Student gets A grade : " + a);
        } else if (a >= 75 && a <= 89) {
            System.out.println("Student gets B grade : " + a);
        } else if (a <= 74 && a >= 33) {
            System.out.println("Student gets C grade : " + a);
        }else
            System.out.println("Failed in examination :" + a);
    }
}
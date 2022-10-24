import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.println("enter number");
       int num = obj.nextInt();
       System.out.println("number is"+num); 
    }
}
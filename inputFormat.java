import java.util.Scanner;

public class inputFormat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.printf("Your number is %d. ", num);
    }
}
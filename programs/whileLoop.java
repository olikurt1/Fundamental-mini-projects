import java.util.Scanner;
public class whileLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int iterations = 0;
        int total = 0;
        while (iterations != 10){
            System.out.print("What is your number: ");
            int number = input.nextInt();
            total += number;
            iterations ++;
            
        }
        System.out.println(total);
        input.close();
    }
}
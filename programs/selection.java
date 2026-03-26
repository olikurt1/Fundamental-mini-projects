import java.util.Scanner;
public class selection{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your number: ");
        int userNumber = input.nextInt();
        //if statement version
        if(userNumber < 1){
            System.out.println("Incorrect value range (tooLittle)");

        }
        else if(userNumber > 1000){
            System.out.println("Incorrect value range (tooMuch)");
        }
        else if(userNumber  <=1000 && userNumber >= 1 ){
            System.out.printf("%d is in the correct range.", userNumber);
        }
        input.close();
    }
}
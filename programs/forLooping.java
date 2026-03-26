import java.util.Scanner;
public class forLooping{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0; 
        for (int x = 0; x < 10; x++){
            System.out.print("Number entry: ");
            int userNumber = input.nextInt();
            total += userNumber;
        }
        System.out.println(total);
        input.close();
    }
}
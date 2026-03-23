import java.util.Scanner;
public class forLooping{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //will do 10 iterations but the index is 0-9 including 0 and 9. 
        for (int x = 0; x < 10; x++){
            System.out.println(x);
        }
    }
}
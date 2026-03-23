
import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        String [] names = {"John", "Sam", "Pork"};
        System.out.print(names[0]);//prints the object at the index provided
        //for each
        for(String name: names){
            System.out.println(name);
        }
    }
}
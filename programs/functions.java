public class functions{
    static void printHelloWorld(){
        System.out.println("Hello World");
    }
    static int valReturn(int x){
        return(x);
    }
    public static void main(String[] args){
        printHelloWorld();
        int value = valReturn(5);
        System.out.printf("The number you put in and the number the function returned is %d", value);
    }
    
}
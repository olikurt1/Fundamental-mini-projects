import java.io.*;
public class fileIO{
    public static void main(String[] args){
        String[] names = {"Ollie", "John", "Mike"};
        //file writing 
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to the file");
            writer.write("\nHere is another line.\n");
            for(String name:names){
                writer.write(name+"\n");
            }
        writer.close();
        } 
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            //declaring a variable which stores the line at the current iteration of the loop so that program knows what to print
            String Line;
            while((Line = reader.readLine())!= null){
                System.out.println(Line);
            }
            reader.readLine();
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
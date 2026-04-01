import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class fileIO{
    public static void main(String[] args)throws IOException{
        String[] names = {"Ollie", "John", "Mike"};
        //file writing 
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to the file");
        writer.write("\nHere is another line.\n");
        for(String name:names){
            writer.write(name+"\n");
        }
        writer.close();
    }
}
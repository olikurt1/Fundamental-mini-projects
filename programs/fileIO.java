import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class fileIO{
    public static void main(String[] args)throws IOException{
        //file writing 
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to the file");
        writer.write("\nHere is another line.");
        writer.close();
    }
}
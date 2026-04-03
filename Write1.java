import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write1{
    public static void main(String[] args){
        try{
            BufferedWriter write= new BufferedWriter(new FileWriter("text.txt", false));
            write.write("Hello World.");
            write.newLine();
            write.write("This is a new line.");
            write.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
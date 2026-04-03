import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write2{
    private static void WriteToFile(String content){
        try{
            BufferedWriter write= new BufferedWriter(new FileWriter("text.txt", false));
            write.write(content);
            write.close();
            System.out.println("Content written to file.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Program finished.");
        }
    }

    public static void main(String[] args){
        String content= """
                This is the content of the file.
                Now you can read each line carefully.
                First of all, there was an error.
                Now all have been debugged.
                """;
        WriteToFile(content);
    }
}
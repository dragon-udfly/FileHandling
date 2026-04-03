import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class Writing{

    private static void contentToFile(String name, String content){
        try{
            File fObj= new File(name);
            if(fObj.exists() && fObj.canWrite()){
                BufferedWriter writer= new BufferedWriter(new FileWriter(name, false));
                writer.write(content);
                writer.close();
                System.out.println(fObj.getName()+ " writen successfully.");
            }else{
                System.out.println(name+ " does not exist or can not be writen.");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        String content= "This is a file.";
        contentToFile("text.txt", content);
    }
}
import java.io.File;

public class Handle1{
    public static void main(String[] args){
        try{
           File fObj= new File("List.txt");
           if(fObj.exists()){
            System.out.println(fObj.getName()+ " exists.");
            System.out.println("Size: "+ fObj.length()+ " bytes");
            System.out.println("Readability: "+ fObj.canRead());
            System.out.println("Executability: "+ fObj.canExecute());
            System.out.println("Writability: "+ fObj.canWrite());
            System.out.println("Absolute path: "+ fObj.getAbsolutePath());
           }else{
            System.out.println("File does not exist.");
           }
        }catch(Exception e){
            System.out.println("Error encountered.");
            System.out.println(e.getMessage());
        }
    }
}
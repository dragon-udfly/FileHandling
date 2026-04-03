import java.io.File;
import java.util.Scanner;

public class Handle0{

    private static void createFile(String name){
        try{
            File fObj= new File(name);
            if(fObj.createNewFile()){
                System.out.println(fObj.getName()+ " created.");
            }else{
                System.out.println(fObj.getName()+ " not created.");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.print("Enter file name: ");
            String name= sc.nextLine();
            createFile(name);
        }catch(Exception e){
            System.out.println("Error encounted.");
        }finally{
            sc.close();
        }
    }
}
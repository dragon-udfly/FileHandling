import java.io.File;

public class Handle2{
    public static void main(String[] args){
        try{
            File fObj= new File("List.txt");
            if(fObj.delete()){
                System.out.println(fObj.getName()+ " deleted.");
            }else{
                System.out.println(fObj.getName()+ " not deleted.");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
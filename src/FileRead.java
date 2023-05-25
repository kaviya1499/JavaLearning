import java.util.Scanner;
import java.io.File;

public class FileRead {
    public static void main(String[] args){
        try{
            //int i = 1%0;
            File f = new File("C:\\Users\\kaviya\\Desktop\\kavi.txt");
            Scanner read = new Scanner(f);
            while (read.hasNextLine()){
                System.out.println(read.nextLine());
            }

        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}

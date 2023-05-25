import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;



public class FileCreateWriteRead {
    public static void main(String[] args){
        try {
            File f = new File("C:\\Users\\kaviya\\Desktop\\kavi2.txt");

            //file creation
            f.createNewFile();

            //file write
            FileWriter writter = new FileWriter(f);
            writter.write("hello kaviya \n its cool day");
            writter.flush();
            writter.close();

            //file read
            Scanner read = new Scanner(f);
            while (read.hasNextLine()){
                System.out.println(read.nextLine());
            }



        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

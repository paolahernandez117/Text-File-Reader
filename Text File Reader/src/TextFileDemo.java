import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo{
    public static void main(String[]args){
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream("player.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found.");
            System.exit(0);
        }
        int highscore;
        String name;

        System.out.println("Text left to read?"+ fileIn.hasNextLine());
        highscore = fileIn.nextInt();
        fileIn.nextLine();
        name = fileIn.nextLine();

        System.out.println("Name: "+ name);
        System.out.println("High score: "+highscore);
        System.out.println("Text left to read? "+ fileIn.hasNextLine());
        fileIn.close();
    }
}
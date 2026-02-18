import java.io.File;       
import java.io.FileNotFoundException; 
import java.util.Scanner;   

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            Scanner reader = new Scanner(myFile);
            
            System.out.println("--- Reading File Content ---");
            
            while (reader.hasNextLine()) ;
                String data = reader.nextLine();
                System.out.println(data);
            }
        
            reader.close();
            
        } catch (FileNotFoundException e) {
            // This runs if the file is not found
            System.out.println("Error: The file was not found.");
            e.printStackTrace();
        }
    }
}
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public void readFromFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            Scanner read = new Scanner(reader);


            read.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

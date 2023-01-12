import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public void readFromFile(String fileName) {
        try {
            Scanner read = new Scanner(new FileReader(fileName));

            while(read.hasNext()) {
                System.out.println(read.nextLine());
            }

            read.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public void readFromFile(String fileName, String delimiter) {
        try {
            Scanner read = new Scanner(new FileReader(fileName));
            read.useDelimiter(delimiter);
            while(read.hasNext()) {
                System.out.println(read.next());
            }

            read.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

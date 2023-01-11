import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    public void writeToFile(String filename, String data) {
        try {
            PrintWriter write = new PrintWriter(new FileWriter(filename, true));
            write.println(data);

            write.close();
        } catch(IOException exception) {
            System.out.println(exception);
        }
    }
}

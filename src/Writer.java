import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

    public void writeToFile(String filename, ArrayList<String> data, String delimiter) {
        try {
            PrintWriter write = new PrintWriter(new FileWriter(filename, false));

            for(String token : data) {
                write.print(token + delimiter);

            }

            write.close();

        } catch(IOException exception) {
            System.out.println(exception);
        }
    }
}

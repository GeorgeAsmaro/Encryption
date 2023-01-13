import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writer {

    /**
     Write data to fileName file, either overriding or appending
     * @param fileName      The name of the file to write to
     * @param data          The data to be written
     * @param appendData    True = append data, False = overwrite data
     */
    public void writeToFile(String fileName, String data, boolean appendData) {

        try {
            PrintWriter write = new PrintWriter(new FileWriter(fileName, appendData));
            write.println(data);

            write.close();
        } catch(IOException exception) {
            System.out.println(exception);
        }
    }

    /**
     *
     * @param fileName      File name
     * @param contents      ArrayList contents
     * @param appendData    True = append data, False = overwrite data
     */
    public void writeToFile(String fileName, ArrayList<String> contents, boolean appendData) {
        try {
            PrintWriter write = new PrintWriter(new FileWriter(fileName, false));

            for(String data : contents) {
                write.println(data);

            }
            write.close();

        } catch(IOException exception) {
            System.out.println(exception);
        }
    }
}

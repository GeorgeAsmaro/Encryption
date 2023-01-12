import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Reader read = new Reader();
        Writer write = new Writer();

        ArrayList<String> data = new ArrayList<>();
        data.add("Hello");
        data.add("welcome");
        data.add("to");
        data.add("my");
        data.add("file!");

        write.writeToFile("DelimiterFile.txt", data, "/");
        read.readFromFile("DelimiterFile.txt","/");

    }
}
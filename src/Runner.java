public class Runner {

    public static void main(String[] args) {
        Reader read = new Reader();
        Writer write = new Writer();

        write.writeToFile("NewFile.txt","Here is some text!");
    }
}
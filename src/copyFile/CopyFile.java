package copyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/copyFile/copy.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/copyFile/getCopy.txt"))) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.err.println("file don't exists");
        }
    }
}

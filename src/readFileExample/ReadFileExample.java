package readFileExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public  void readFileTxt(String path){
       try(  BufferedReader bufferedReader = new BufferedReader(new FileReader(path))
       ) {
           String line;
           int sum =0;
           while ((line = bufferedReader.readLine()) != null){
               System.out.println(line);
               sum += Integer.parseInt(line);
           }
           System.out.println("sum" + sum);
       } catch (Exception e) {
           System.err.println("file don't exists");
       }

   }
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       String path = scanner.nextLine();
       ReadFileExample readFileExample = new ReadFileExample();
       readFileExample.readFileTxt(path);
    }
}

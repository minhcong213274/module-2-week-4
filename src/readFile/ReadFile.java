package readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        List<National> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/readFile/test.csv"))) {
            String line;
            while ((line = bufferedReader.readLine())!=null){
                National national = new National();
                String [] strings = line.split(",");
               national.setId(Integer.parseInt(strings[0]));
               national.setCode(strings[1]);
               national.setName(strings[2]);
               list.add(national);
            }System.out.println(list);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

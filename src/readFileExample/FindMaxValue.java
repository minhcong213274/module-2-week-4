package readFileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public List<Integer> readFile(String filePath){
        List<Integer>  num = new ArrayList<>();
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
           String line;
           while ((line = bufferedReader.readLine()) != null){
              num.add(Integer.parseInt(line));
           }
        } catch (Exception e) {
            System.err.println("file don't exists");;
        }return num;
    }
    public void writeFile(String filePath,int max){
        try(FileWriter fileWriter = new FileWriter(filePath,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("max:" + max);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> num){
        int max = num.get(0);
        for (int i = 0;i<num.size();i++){
            if (max<num.get(i)){
                max = num.get(i);
            }
        }return max;
    }

    public static void main(String[] args) {
        FindMaxValue findMaxValue = new FindMaxValue();
        List<Integer> num =  findMaxValue.readFile("./src/readFileExample/numbers.txt");
        int maxValue = findMax(num);
        findMaxValue.writeFile("./src/readFileExample/result.txt",maxValue);
    }
}

package manage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ManageProduct extends ArrayList<Product> {

    public void writeDataToFile(String path){
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  List<Product> readDataToFile(String path){
        List<Product> products = new ArrayList<>();
        try(FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            products = (List<Product>) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }return products;
    }
    public  void display(){
        List<Product> products = new ArrayList<>();
        products.stream().forEach(System.out::println);
    }
    public  List<Product> searchProduct( String name){
      return  this.stream().filter(product -> product.getName().equals(name)).collect(Collectors.toList());
    }


}

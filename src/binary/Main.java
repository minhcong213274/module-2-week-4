package binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students){
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(students);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromToFile(String path){
        List<Student> students = new ArrayList<>();
        try(FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            students = (List<Student>) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("./src/binary/student.txt",students);
        List<Student> studentDataFromFile = readDataFromToFile("./src/binary/student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}

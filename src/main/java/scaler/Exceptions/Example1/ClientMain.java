package main.java.scaler.Exceptions.Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClientMain {
    public static void main(String[] args) throws FileNotFoundException{
        readFile("D:\\ScalerAcedemy\\LLD\\Java practice\\HelloWorld\\src\\main\\java\\scaler\\Exceptions\\text.txt");
    }

    public static void readFile(String filePath) throws FileNotFoundException{
        System.out.println("Starting to read file");
        File file = new File(filePath);
        // Breaks the control flow as soon as an exception is thrown
        FileReader fileReader = new FileReader(file);
        // Try-catch
//        try{
//            FileReader fileReader = new FileReader(file);
//        } catch (FileNotFoundException ex){
//            System.out.println("Something went wrong");
//        }


        System.out.println("File read done");

    }
}

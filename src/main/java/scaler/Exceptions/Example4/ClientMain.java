package main.java.scaler.Exceptions.Example4;

import java.io.FileNotFoundException;

public class ClientMain {
    public static void main(String[] args) throws FileNotFoundException {
        ServiceA serviceA = new ServiceA();

        try{
            serviceA.get();
        } catch (FileNotFoundException ex){
            System.out.println("Something Went Wrong");
        }

    }
}

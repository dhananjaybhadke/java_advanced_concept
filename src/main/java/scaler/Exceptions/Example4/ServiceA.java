package main.java.scaler.Exceptions.Example4;

import java.io.FileNotFoundException;

public class ServiceA {
    ServiceB serviceB = new ServiceB();
    public void get() throws FileNotFoundException {
        serviceB.getFromB();
    }
}

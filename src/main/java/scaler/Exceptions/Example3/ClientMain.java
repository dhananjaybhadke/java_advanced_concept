package main.java.scaler.Exceptions.Example3;

public class ClientMain {
    public static void main(String[] args) throws FileNameIsWrongException {

        try {
            CustomFileReader customFileReader = new CustomFileReader();
            customFileReader.readFile("text.txt");
        }catch (FileNameIsWrongException ex){
            System.out.println("Some exception occurred");
        }

    }
}

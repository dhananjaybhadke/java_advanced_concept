package main.java.scaler.Exceptions.Example3;

public class CustomFileReader {
    public void readFile(String filePath) throws FileNameIsWrongException {
        System.out.println("Trying to read the file");
        System.out.println("Doing some operations for reading the file");

        // Rule: Most of the time, throw specific exceptions
        if(!isFileFound(filePath)){
            throw new FileNameIsWrongException("File name not found");
        }
    }

    private boolean isFileFound(String filePath) {
        // Check if file exists
        return false;
    }
}

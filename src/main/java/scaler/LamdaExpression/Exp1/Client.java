package main.java.scaler.LamdaExpression.Exp1;

public class Client {
    public static void main(String[] args) {

        decider("upper","Dhananjay");

    }

    public static void decider(String val,String text){

        if(val.equals("upper"))
            printUpper(text);
        else if (val.equals("lower"))
            printLower(text);
        else printText(text);
    }

    public static void printUpper(String text){
        System.out.printf(text.toUpperCase());
    }

    public static void printLower(String text){
        System.out.printf(text.toLowerCase());
    }

    public static void printText(String text){
        System.out.printf(text);
    }
}

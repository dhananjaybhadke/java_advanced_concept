package main.java.scaler.LamdaExpression.Exp1;

import java.util.function.Function;

public class ClientLambda {

    public static void main(String[] args) {

        decider("upper").apply("Dhananjay");

    }

    public static Function<String, String> decider(String val){

        if(val.equals("upper")) {
            // Method reference
            return ClientLambda::printUpper;
        }
        else if (val.equals("lower")) {
            return (value) -> printLower(value);
        } else{
            return (value) -> printText(value);
        }
    }

    public static String printUpper(String text){
        System.out.printf(text.toUpperCase());
        return "fromUpper";
    }

    public static String printLower(String text){
        System.out.printf(text.toLowerCase());
        return "fromLower";
    }

    public static String printText(String text){
        System.out.printf(text);
        return "fromPrint";
    }
}

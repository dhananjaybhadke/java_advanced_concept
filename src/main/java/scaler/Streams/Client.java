package main.java.scaler.Streams;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        // print(list);
        // printUsingStream(list);
        // printSquare(list);
        // printSquareMap(list);
        // printEven(list);
        // printEvenWithFilter(list);
        // printEvenSquare(list);
        printSum(list);
    }

    // Question 1
    // Given a list of integers, print each value in it in normal way
    public static void print(List<Integer> list){
        list.forEach(System.out::println);
    }

    // Question 2
    // Given a list of integers, print each value in it using stream
    public static void printUsingStream(List<Integer> list){
        // method reference
        list.stream().forEach(System.out::println);
        list.stream().forEach((val) -> System.out.println(val));
    }

    // Question 3
    // Given a list of integers, print the square of each value
    public static void printSquare(List<Integer> list){
        list.stream().forEach((val) -> System.out.println(val*val));
    }

    // Question 4
    // Same question as above but don't use the squaring logic in forEach
    public static void printSquareMap(List<Integer> list){
        // With method reference
        // list.stream().map((val) -> val*val).forEach(System.out::println);

        // A mapping operation is called an intermediate operation. Which means
        // that it doesn't end the stream but returns another stream.

        // This is called chaining
        // method1 -> method2 -> method3
        // H/W find the difference between stream forEach method and normal forEach method
        list.stream()
                .map((val) -> val*val)
                .forEach((val) -> System.out.println(val));
    }

    // Question 5
    // Print even numbers
    public static void printEven(List<Integer> list){
        list.stream()
                .forEach((val) -> {
                    if(val%2 == 0){
                        System.out.println(val);
                    }
                });
    }

    // question 6
    // Same as above but with no logic in forEach
    public static void printEvenWithFilter(List<Integer> list){
        list.stream()
                .filter((val) -> val % 2 == 0)
                .forEach(System.out::println);
    }

    // Question 7
    // Find all the even numbers and print their square
    public static void printEvenSquare(List<Integer> list){
        list.stream()
                .filter((val) -> val % 2 == 0)
                .map((val) -> val * val)
                .forEach((val) -> System.out.println(val));
    }

    // Question 7
    // Given a list of integers, print its sum
    // Special methods called "reducers" that return a single value
    // Example: "reduce" and "collect"
    public static void printSum(List<Integer> list){
        int sum = list.stream()
                .reduce(0,(currentElement, currentSum) -> {
                    return currentSum + currentElement;
                });
        System.out.println(sum);
    }
}

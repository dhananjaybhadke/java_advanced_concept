package main.java.scaler.LamdaExpression;

public class MainClass {
    public static void main(String[] args) {

        AddNumber ad = new AddNumber() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(ad.add(2,4));

        AddNumber ad1 = (a, b) -> a+b;
        System.out.println(ad1.add(3,4));

        // anonymous class
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing thread");
            }
        };
        Thread thread = new Thread(t1);
        thread.start();

        // Lamda exp
        Runnable t2 = () -> System.out.println("Printing lamda thread");
        Thread thread1 = new Thread(t2);
        thread1.start();

        // anonymous class
//        MyName person = new MyName() {
//            @Override
//            public void sayMyName() {
//                System.out.printf("My Name is Dhananjay");
//            }
//        };
//        person.sayMyName();
        // Lamda Exp
//        MyName p1 = (String name) -> {
//            return "Return say my name, "+ name;
//        };
//        System.out.printf(p1.sayMyName("Dhananjay"));
    }
}

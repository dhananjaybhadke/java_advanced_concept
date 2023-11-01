package main.java.scaler.BuilderDesignPattern;

public class ClientMain {
    public static void main(String[] args) {
//        Option1
//        Builder builder = new Builder();
//        builder.setName("Dhananjay");
//        builder.setAge(100);
//        builder.setBatchName("Intermediate");
//        builder.setUnivName("SCOE");
//
//        Student student = new Student(builder);

//        Option 2
//        Builder builder = Student.getBuilder();
//        builder.setName("DJ");
//        builder.setAge(20);
//        builder.setPhone("955203");
//        Student student = builder.build();

//        Option 3
        Student student = Student.getBuilder()
                        .setName("Chetan")
                                .setPhone("95525678")
                                        .setUnivName("SCOE")
                                                .build();


        System.out.println("Hii");
    }
}

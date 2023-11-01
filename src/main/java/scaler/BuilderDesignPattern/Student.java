package main.java.scaler.BuilderDesignPattern;

public class Student {

    private String name;
    private int age;
    private String univName;
    private String batchName;
    private String phone;

    public Student(Builder builder){
        if(builder.getAge() > 100){
            throw new RuntimeException("Age is not valid");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.univName = builder.getUnivName();
        this.batchName = builder.getBatchName();
        this.phone = builder.getPhone();
    }

    public static  Builder getBuilder(){
        return new Builder();
    }

    // Create Inner class
    // this is to tightly coupled the student and builder class
    // As Builder is a nested class of Student so it does not exist until Student object created
    public static class Builder {

        private String name;
        private int age;
        private String univName;
        private String batchName;
        private String phone;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}

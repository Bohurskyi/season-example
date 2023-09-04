package main;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Dmytro", 100);

        Student student2 = new Student();
        student2.setName("Denys");
        student2.setRating(90);

        Student student3 = new Student("Ihor", 10);

        double average = Student.getAvgRating(student1, student2, student3);
        System.out.println("Avarage = " + average);

        student1.changeRating(20);

        average = Student.getAvgRating(student1, student2, student3);
        System.out.println("Avarage = " + average);
    }
}
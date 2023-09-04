package main;

public class Student {
    private int rating;
    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public static double getAvgRating(Student student1, Student student2, Student student3) {
        double avarage = (student1.getRating()+student2.getRating()+student3.getRating())/3;
        return avarage;
    }

    public static double getAvgRating() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        return this.rating < student.getRating();
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
        this.rating = rating;
    }

    public static void removeStudent(Student student) {
        // TODO remove student
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "my name: " + name + ", my rating: " + rating;
    }
}

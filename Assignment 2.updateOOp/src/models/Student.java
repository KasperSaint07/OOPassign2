package models;

import java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    static int idCounter = 1;
    private ArrayList<Integer> grades;


    public Student() {
    }
    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age, gender);
        this.studentId = idCounter++;
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
        else {
            System.out.println("Grade can only be 0 and 100");
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < grades.size(); i++) {
            sum += (grades.get(i) / 100.0) * 4.0;
        }

        return Math.round(sum / grades.size());
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentId + " , My GPA: " + calculateGPA();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

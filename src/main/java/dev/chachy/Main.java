package dev.chachy;

import dev.chachy.calculator.Calculator;
import dev.chachy.data.Student;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student testStudent = new Student();
        testStudent.setMarks(Map.of("AI", 80f));
        Student testStudent1 = new Student();
        testStudent1.setMarks(Map.of("AI", 20f));
        Student testStudent2 = new Student();
        testStudent2.setMarks(Map.of("AI", 90f));
        Student testStudent3 = new Student();
        testStudent3.setMarks(Map.of("Network", 90f));
        Student testStudent4 = new Student();
        testStudent4.setMarks(Map.of("Network", 40f));
        Student testStudent5 = new Student();
        testStudent5.setMarks(Map.of("Network", 100f));

        Student[] students = new Student[]{testStudent4, testStudent1, testStudent2, testStudent3, testStudent5};

        Calculator.calculateAverage(students);
    }
}

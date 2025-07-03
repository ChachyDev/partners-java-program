package dev.chachy.calculator;

import dev.chachy.data.Student;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static void calculateAverage(Student[] students) {
        Map<String, Float> modules = new HashMap<>();
        for (Student student : students) {
            for (Map.Entry<String, Float> module : student.getMarks().entrySet()) {
                modules.put(module.getKey(), modules.getOrDefault(module.getKey(), 0f) + module.getValue());
            }
        }

        for (Map.Entry<String, Float> module : modules.entrySet()) {
            System.out.printf("Module average of %s: %s%n", module.getKey(), module.getValue() / students.length);
        }
    }
}

package ПР_13;

import java.util.Arrays;

public class Student_ex4 implements Comparable<Student_ex4> {
    private int idNumber;
    private String name;

    public Student_ex4(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student_ex4 other) {
        // Сортировка по ID в порядке возрастания
        return Integer.compare(this.idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return "Student{idNumber=" + idNumber + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        Student_ex4[] students = {
                new Student_ex4(101, "Alice"),
                new Student_ex4(103, "Bob"),
                new Student_ex4(100, "Charlie")
        };

        Arrays.sort(students); // Сортируем с использованием compareTo

        System.out.println("After sorting by ID:");
        for (Student_ex4 student : students) {
            System.out.println(student);
        }
    }
}

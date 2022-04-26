package es.fpdual.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.fpdual.model.Student;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(2, "Juan", 9.2),
                new Student(12, "Pepe", 7.5),
                new Student(3, "Adri", 4.1),
                new Student(123, "Laura", 3.6),
                new Student(551, "Fran", 10),
                new Student(1, "Christian", 9.8));

        System.out.println("Unordered student list: ");
        studentList.forEach(e -> System.out.println(e));

        Collections.sort(studentList);

        System.out.println("Ordered student list by default (name): ");
        studentList.forEach(e -> System.out.println(e));

        // Collections.sort(studentList, new StudentComparatorById());

        // Collections.sort(studentList, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // return (int) Math.round(o2.getCalification() - o1.getCalification());
        // }
        // });

        Collections.sort(studentList, (s1, s2) -> s1.getId() - s2.getId());

        System.out.println("Ordered student list by id: ");
        studentList.forEach(e -> System.out.println(e));
    }

}

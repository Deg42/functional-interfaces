package es.fpdual.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import es.fpdual.model.Student;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        cons.accept("Example");

        List<Student> studentList = Arrays.asList(
                new Student(1, "Juan", 9.2),
                new Student(2, "Pepe", 7.5),
                new Student(3, "Adri", 4.1),
                new Student(4, "Laura", 3.6),
                new Student(5, "Fran", 10),
                new Student(6, "Christian", 9.8));

        StudentOperations op = new StudentOperations();

        Consumer<Student> printStudent = e -> System.out
                .println(" | Name: " + e.getName() +
                        " | Calification: " + e.getCalification());

        Consumer<Student> decreaseCalifications = e -> e.setCalification(e.getCalification() * 0.8);
        Consumer<Student> roundCalifications = e -> e.setCalification(Math.round(e.getCalification()));

        Consumer<Student> roundAndPrint = roundCalifications.andThen(printStudent);

        op.acceptAll(studentList, printStudent);

        System.out.println("Decreasing califications... ");
        op.acceptAll(studentList, decreaseCalifications);
        op.acceptAll(studentList, printStudent);
        System.out.println("Rounding califications... ");
        op.acceptAll(studentList, roundAndPrint);
    }
}

package es.fpdual.consumer;

import java.util.List;
import java.util.function.Consumer;

import es.fpdual.model.Student;

public class StudentOperations {
    public void acceptAll(List<Student> studentList, Consumer<Student> cons) {
        for (Student student : studentList) {
            cons.accept(student);
        }
    }
}

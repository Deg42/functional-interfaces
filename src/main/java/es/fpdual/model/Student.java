package es.fpdual.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double calification;

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

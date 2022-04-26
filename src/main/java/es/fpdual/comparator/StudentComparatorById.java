package es.fpdual.comparator;

import java.util.Comparator;

import es.fpdual.model.Student;

public class StudentComparatorById implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) Math.round(o1.getId() - o2.getId());
    }

}

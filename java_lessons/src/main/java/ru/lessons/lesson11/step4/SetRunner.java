package ru.lessons.lesson11.step4;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        final Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        final var contained = set.contains(4); // false
        System.out.println(set);

        final var student1 = new Student(UUID.randomUUID(), "Ivan", 33);
        final var student2 = new Student(UUID.randomUUID(), "John", 22);
        final var student3 = new Student(UUID.randomUUID(), "Petr", 44);
        final var students = new HashSet<>(List.of(student1, student2, student3));
        final var arr = students.toArray(Student[]::new);
        final var student1Copy = new Student(UUID.randomUUID(), "Ivan", 33);
        final var exists = students.contains(student1Copy); // false если не реализовать equals() и hashCode в Student
        System.out.println("Множество = " + students);
        students.add(student1Copy); // дубликат если не реализовать equals() и hashCode в Student

        final Set<Student> studentsLinkedList = new LinkedHashSet<>();
        studentsLinkedList.add(student1);
        studentsLinkedList.add(student2);
        studentsLinkedList.add(student3);
        System.out.println("Связанное множество = " + studentsLinkedList);
    }
}

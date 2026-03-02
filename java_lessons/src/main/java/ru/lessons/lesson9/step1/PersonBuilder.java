package ru.lessons.lesson9.step1;

import java.util.Scanner;

public class PersonBuilder {
    public static void main(String[] args) {
        try(Scanner sc =  new Scanner(System.in)) {
            final var person = new Person();
            person.setEmail("email");
            System.out.println(person);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

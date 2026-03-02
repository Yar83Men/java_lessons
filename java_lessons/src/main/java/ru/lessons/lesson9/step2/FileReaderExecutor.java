package ru.lessons.lesson9.step2;

import java.io.IOException;

public class FileReaderExecutor {
    public static void main(String[] args) throws IOException {
        final var fileReader = new FileReader();
            final var result = fileReader.readFile("src/main/java/ru/lessons/lesson9/План.txt");
            System.out.println(result);

    }
}

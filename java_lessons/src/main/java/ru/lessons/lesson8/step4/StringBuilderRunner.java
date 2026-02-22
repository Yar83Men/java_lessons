package ru.lessons.lesson8.step4;

public class StringBuilderRunner {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Hello");

        // Добавляем строку
        sb.append(" World");
        System.out.println(sb.toString()); // Hello World

        // Вставляем в начало
        sb.insert(0, "Say: ");
        System.out.println(sb.toString()); // Say: Hello World

        // Заменяем часть
        sb.replace(0, 4, "Hi");
        System.out.println(sb.toString()); // Hi: Hello World

        // Удаляем часть
        sb.delete(0, 3);
        System.out.println(sb.toString()); // : Hello World

        // Разворачиваем
        sb.reverse();
        System.out.println(sb.toString()); // dlroW olleH :
    }
}

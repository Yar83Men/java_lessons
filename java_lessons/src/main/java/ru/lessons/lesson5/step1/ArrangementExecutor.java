package ru.lessons.lesson5.step1;

import java.util.UUID;

public class ArrangementExecutor {
    public static void main(String[] args) {
        FinancialArrangement financialArrangement = new FinancialArrangement(
                UUID.randomUUID(),
                "Петров",
                "Иванов",
                true);

        System.out.println(financialArrangement.getDate());

        LegalArrangement legalArrangement = new LegalArrangement(
                UUID.randomUUID(),
                "Cидоров",
                "Романов",
                true,
                "ФЗ-22344");

        System.out.println(legalArrangement.getDate());
    }
}

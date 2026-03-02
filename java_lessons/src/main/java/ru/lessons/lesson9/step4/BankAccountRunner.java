package ru.lessons.lesson9.step4;

public class BankAccountRunner {
    public static void main(String[] args) {
        final var bankAccount = BankAccount.builder()
                .active(true)
                .balance(-500)
                .firstname("Иван")
                .redSaldo(false)
                .build();

        final var validator = new BankAccountValidator();
        try {
            final var valid = validator.validate(bankAccount);
            System.out.println("Результат проверки банковского счета = " + valid);
        } catch (BankAccountException exception) {
            System.out.println(exception.getMessage() + " " + exception.getBusinessCode());
            throw new RuntimeException(exception);
        }

        //System.out.println(bankAccount.getLastname().toUpperCase()); // NPE
    }
}

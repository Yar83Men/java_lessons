package ru.lessons.lesson9.step4;

public class BankAccountValidator {

    public boolean validate(BankAccount bankAccount) {
        if (!bankAccount.isActive()) {
            throw new BankAccountException("Банковский счет не активный", 100);
        }
        if (bankAccount.getBalance() < 0 && !bankAccount.isRedSaldo()) {
            throw new BankAccountException("Банковский счет не может быть негативным", 200);
        }
        return true;
    }
}

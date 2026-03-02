package ru.lessons.lesson9.step4;

import lombok.Getter;

@Getter
public class BankAccountException extends RuntimeException {
    private int businessCode;

    public BankAccountException(String message, int businessCode) {
        super(message);
        this.businessCode = businessCode;
    }
}

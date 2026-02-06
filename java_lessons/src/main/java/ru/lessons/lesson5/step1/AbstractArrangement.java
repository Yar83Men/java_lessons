package ru.lessons.lesson5.step1;

import java.time.LocalDate;
import java.util.UUID;

// Абстрактный каркас для формирования договоренностей
public abstract class AbstractArrangement {
    // id договора
    private UUID id;
    // Первая сторона договора
    private String firstPartyOfAgreement;
    // Вторая сторона договора
    private String secondPartyOfAgreement;
    // Дата заключения договоренности ГГ-ММ-ДД
    private LocalDate date;
    // Активная договоренность
    private boolean isActive;

    public AbstractArrangement() {
    }

    public AbstractArrangement(UUID id,
                               String firstPartyOfAgreement,
                               String secondPartyOfAgreement,
                               boolean isActive) {
        this.id = id;
        this.firstPartyOfAgreement = firstPartyOfAgreement;
        this.secondPartyOfAgreement = secondPartyOfAgreement;
        // дата будет формироваться на момент создания договоренности
        this.date = LocalDate.now();
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstPartyOfAgreement() {
        return firstPartyOfAgreement;
    }

    public void setFirstPartyOfAgreement(String firstPartyOfAgreement) {
        this.firstPartyOfAgreement = firstPartyOfAgreement;
    }

    public String getSecondPartyOfAgreement() {
        return secondPartyOfAgreement;
    }

    public void setSecondPartyOfAgreement(String secondPartyOfAgreement) {
        this.secondPartyOfAgreement = secondPartyOfAgreement;
    }

    // только Getter для даты
    public LocalDate getDate() {
        return date;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

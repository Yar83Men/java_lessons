package ru.lessons.lesson5.step1;

import java.util.UUID;

public class LegalArrangement extends AbstractArrangement {
    private String federalLawNumber;

    public LegalArrangement(UUID id,
                            String firstPartyOfAgreement,
                            String secondPartyOfAgreement,
                            boolean isActive,
                            String federalLawNumber) {
        // вызываем конструктор супер класса (родительского)
        super(id, firstPartyOfAgreement, secondPartyOfAgreement, isActive);
        this.federalLawNumber = federalLawNumber;
    }
}

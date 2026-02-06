package ru.lessons.lesson5.step1;

import java.util.UUID;

public class FinancialArrangement extends AbstractArrangement {

    public FinancialArrangement(UUID id,
                                String firstPartyOfAgreement,
                                String secondPartyOfAgreement,
                                boolean isActive) {
        super(id, firstPartyOfAgreement, secondPartyOfAgreement, isActive);
    }
}

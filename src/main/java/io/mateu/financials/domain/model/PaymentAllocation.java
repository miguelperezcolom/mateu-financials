package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

@MateuMDDEntity
public abstract class PaymentAllocation {

    String description;

    double value;
}

package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class MethodOfPayment {

    @NotEmpty
    private String name;

    @ManyToOne
    @NotNull
    private final Account account;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;


    private double transactionCostPercent;

}

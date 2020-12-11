package io.mateu.financials.domain.model;

import io.mateu.mdd.shared.annotations.Output;
import lombok.MateuMDDEntity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Currency;

@MateuMDDEntity
public class ReportedPayment {

    @ManyToOne@NotNull
    CommissionAgent agent;

    @ManyToOne@NotNull
    Order order;

    @NotNull
    private String who;

    @Column(name = "_when")
    @Output
    private LocalDateTime when = LocalDateTime.now();

    @NotNull
    @ManyToOne
    private MethodOfPayment methodOfPayment;

    @Output
    private double fcyValue;

    @NotNull
    private Currency currency;

    @Output
    private double currencyExchange;

    @Output
    private double value;

}

package io.mateu.financials.domain.model;

import io.mateu.mdd.shared.annotations.KPI;
import io.mateu.mdd.shared.annotations.Money;
import lombok.MateuMDDEntity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@MateuMDDEntity
public class Payment {

    @NotNull
    private final LocalDate date;

    @ManyToOne
    @NotNull
    private final MethodOfPayment methodOfPayment;

    @KPI
    @Money
    private final double value;

    @OneToMany(cascade = CascadeType.ALL)
    List<PaymentAllocation> breakdown = new ArrayList<>();
}

package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@MateuMDDEntity
public class CreditLimit {

    @NotEmpty
    String name;

    @NotNull
    CreditLimitType type;

    @OneToMany
    private List<FinancialAgent> agents = new ArrayList<>();

    @NotNull
    private Currency currency;

    @Column(name = "_limit")
    private double limit;

    private double notificationThreshold;

    private String emails;

    @NotNull@Enumerated(EnumType.STRING)
    private CreditLimitStatus status = CreditLimitStatus.Enabled;

    private double remaining;

    private double percent;

}

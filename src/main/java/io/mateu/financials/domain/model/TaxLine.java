package io.mateu.financials.domain.model;

import io.mateu.mdd.shared.annotations.ReadOnly;
import io.mateu.util.Helper;
import lombok.MateuMDDEntity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity@ReadOnly
public class TaxLine {

    @ManyToOne@NotNull
    Tax tax;

    @Enumerated(EnumType.STRING)@NotNull
    TaxType type;

    double base;

    double percent;

    double value;

    double total;

    public TaxLine(@NotNull Tax tax, @NotNull TaxType type, double base, double percent) {
        this.tax = tax;
        this.type = type;
        this.base = base;
        this.percent = percent;
        value = Helper.roundEuros(base * percent / 100d);
        total = Helper.roundEuros(base + value);
    }
}

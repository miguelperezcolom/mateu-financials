package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class Commission {

    @NotNull@ManyToOne
    CommissionAgent agent;

    double base;

    double percent;

    double total;

}

package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@MateuMDDEntity
public class Provider {

    @NotEmpty
    String name;

    @ManyToOne
    FinancialAgent agent;

}

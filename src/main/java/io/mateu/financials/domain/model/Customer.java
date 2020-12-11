package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@MateuMDDEntity
public class Customer {

    @NotEmpty
    String name;

    @ManyToOne
    FinancialAgent agent;

}

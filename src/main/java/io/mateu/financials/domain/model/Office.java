package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class Office {

    @NotEmpty
    String name;

    @ManyToOne
    @NotNull
    Company company;

    @ManyToOne
    Tax tax;
}

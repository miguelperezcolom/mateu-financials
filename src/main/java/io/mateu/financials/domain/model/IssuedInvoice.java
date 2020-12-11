package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class IssuedInvoice extends Invoice {

    @ManyToOne@NotNull
    Customer customer;

}

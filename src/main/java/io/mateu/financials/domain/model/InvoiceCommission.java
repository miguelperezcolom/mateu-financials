package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class InvoiceCommission extends Commission {

    @ManyToOne@NotNull
    Invoice invoice;

}

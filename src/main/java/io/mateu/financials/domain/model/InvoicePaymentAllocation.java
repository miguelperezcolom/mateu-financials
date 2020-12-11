package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class InvoicePaymentAllocation extends PaymentAllocation {

    @ManyToOne@NotNull
    Invoice invoice;

}

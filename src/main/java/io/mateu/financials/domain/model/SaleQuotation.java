package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@MateuMDDEntity
public class SaleQuotation extends Quotation {

    @ManyToOne@NotNull
    Customer customer;

}

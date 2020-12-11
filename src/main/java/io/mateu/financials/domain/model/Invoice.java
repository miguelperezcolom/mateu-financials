package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@MateuMDDEntity
public class Invoice {

    @NotEmpty
    String number;

    @NotNull
    LocalDate issueDate;

    @NotNull
    LocalDate taxDate;

    @NotNull
    LocalDate dueDate;

    @NotNull@ManyToOne
    FinancialAgent issuer;

    @NotNull@ManyToOne
    FinancialAgent recipient;

    @OneToMany(cascade = CascadeType.ALL)
    List<InvoiceLine> lines = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    List<TaxLine> taxes = new ArrayList<>();

    double total;

    Currency currency;

    double fcyTotal;

    double exchangeRate;

    double totalPaid;

    double balance;

    boolean paid;


}

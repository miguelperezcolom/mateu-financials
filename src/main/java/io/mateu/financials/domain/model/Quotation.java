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
public class Quotation {

    @ManyToOne@NotNull
    Office office;

    @NotNull
    LocalDate date;

    @OneToMany(cascade = CascadeType.ALL)
    List<QuotationLine> lines = new ArrayList<>();

    String comments;

    double total;

    Currency currency;

    double fcyTotal;

    double exchangeRate;

    double totalPaid;

    double balance;

    boolean paid;

}

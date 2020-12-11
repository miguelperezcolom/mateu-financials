package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import java.time.LocalDate;
import java.util.Currency;

@MateuMDDEntity
public class Due {

    FinancialAgent agent;

    String description;

    LocalDate date;

    double total;

    Currency currency;

    double fcyTotal;

    double exchangeRate;

    double totalPaid;

    double balance;

    boolean paid;
}

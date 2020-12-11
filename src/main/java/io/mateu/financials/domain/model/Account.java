package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Currency;

@MateuMDDEntity
public class Account {

    @NotEmpty
    String name;

    @NotNull
    Currency currency;

    double balance;

}

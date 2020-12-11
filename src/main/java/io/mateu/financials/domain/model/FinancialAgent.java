package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.validation.constraints.NotEmpty;

@MateuMDDEntity
public class FinancialAgent {

    @NotEmpty
    String name;

    Tax tax;

    String address;

    String zipCode;

    String city;

    String state;

    String country;

    String telephone;

    String email;

}

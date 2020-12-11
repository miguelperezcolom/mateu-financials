package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.validation.constraints.NotEmpty;

@MateuMDDEntity
public class Company {

    @NotEmpty
    String name;


}

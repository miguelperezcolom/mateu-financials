package io.mateu.financials.domain.model.storage;

import lombok.MateuMDDEntity;

import javax.validation.constraints.NotEmpty;

@MateuMDDEntity
public class Part {

    @NotEmpty
    String name;

}

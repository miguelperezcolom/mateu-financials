package io.mateu.financials.domain.model.storage;

import io.mateu.financials.domain.model.Item;
import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class Stock {

    @ManyToOne@NotNull
    Warehouse warehouse;

    @ManyToOne@NotNull
    Part part;

    double quantity;
}

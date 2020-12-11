package io.mateu.financials.domain.model.storage;

import io.mateu.financials.domain.model.Item;
import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class ItemBreakdown {

    @ManyToOne@NotNull
    Item item;

    @ManyToOne@NotNull
    Part part;

    double quantity;

}

package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@MateuMDDEntity
public class OrderLine {

    @ManyToOne@NotNull
    Item item;

    String description;

    double quantity;

    double price;

    double discountPercent;

    double discount;

    double total;

}

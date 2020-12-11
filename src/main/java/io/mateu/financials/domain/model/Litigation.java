package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@MateuMDDEntity
public class Litigation {

    @ManyToOne@NotNull
    Invoice invoice;

    @ManyToOne@NotNull
    Order order;

    double amount;

    double taken;

    boolean closed;

    LocalDate reminder;

    String comment;

}

package io.mateu.financials.domain.model;

import lombok.MateuMDDEntity;

import javax.persistence.OneToMany;
import java.util.HashMap;
import java.util.Map;

@MateuMDDEntity
public class Tax {

    String name;

    double standardPercent;

    double reducedPercent;

    @OneToMany
    Map<Item, TaxType> taxTypePerItem = new HashMap<>();

}

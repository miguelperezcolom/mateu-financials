package io.mateu.financials.domain.model;

import io.mateu.mdd.shared.annotations.Output;
import lombok.MateuMDDEntity;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@MateuMDDEntity
public class LitigationLogRecord {

    @ManyToOne
    @NotNull
    private Litigation litigation;

    @Output
    private LocalDateTime when;

    private String text;

}

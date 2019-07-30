package com.statics.publics.part.pojo.worker;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EntryForm implements Serializable {

    private Integer entryFormId;
    private String entryFormWorkerId;
    private Integer entryFormCurriculumId;
    private Integer entryFormDetail_id;
    private Integer entryFormDetailNo;
    private String entryFormStartTime;
    private String entryFormAddress;
    private String entryFormQQ;
    private Integer entryFormDetailStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date entryFormCreateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date entryFormEndTime;
    private Integer entryFormApplyPeopleNumber;
    private Integer entryFormPayPeopleNumber;
    private Double entryFormSumMoney;
    private Double entryFormTeacherMoney;
    private Double entryFormPlatFormMoney;
    private Integer entryFormOrderKind;
}

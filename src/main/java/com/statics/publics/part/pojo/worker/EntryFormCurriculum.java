package com.statics.publics.part.pojo.worker;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EntryFormCurriculum implements Serializable {

  private Integer entryFormCurriculumId;
  private Integer entryFormCurriculumCurrentDetail;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date entryFormCurriculumCreateTime;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date entryFormCurriculumEndTime;
  private String entryFormCurriculumLastTime;
  private Integer entryFormCurriculum_entryFormId;
  private Integer entryFormCurriculumCurrentDetailNo;
  private String entryFormCurriculumIsShow;





}

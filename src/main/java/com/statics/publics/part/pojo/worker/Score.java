package com.statics.publics.part.pojo.worker;

import lombok.Data;

import java.io.Serializable;

@Data
public class Score implements Serializable {
  private Integer scoreId;
  private String user_id;
  private Integer course_id;
  private Integer period_id;
  private Integer course_score;
  private Integer environmental_score;
  private Integer teacher_score;
  private String comment_content;
  private String score_time;
  private String user_name;
  private String user_image;
  private String teacher_id;
}

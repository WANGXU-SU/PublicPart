package com.statics.publics.part.pojo.worker;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CurriculumDetail implements Serializable {
    @ApiModelProperty(name = "curriculumDetail_id", value = "课程详情id", example = "1")
    private Integer curriculumDetail_id;
    @ApiModelProperty(name = "curriculumDetailName", value = "课程名", example = "servlet原理")
    private String curriculumDetailName;
    @ApiModelProperty(name = "curriculumDetailDescription", value = "课程描述", example = "这还一门很有学问的课")
    private String curriculumDetailDescription;
    @ApiModelProperty(name = "curriculumDetailTool", value = "课程环境", example = "教室")
    private String curriculumDetailTool;
    @ApiModelProperty(name = "curriculumDetailStartTime", value = "上课时间", example = "2019-05-05 下午2点")
    private String curriculumDetailStartTime;
    @ApiModelProperty(name = "curriculumDetailAddress", value = "上课地址", example = "xxx会议室")
    private String curriculumDetailAddress;
    @ApiModelProperty(name = "curriculumDetailCurrentCount", value = "课程当前报名人数", example = "20")
    private Integer curriculumDetailCurrentPeople;
    @ApiModelProperty(name = "curriculumDetailSumPeople", value = "课程总学习人数", example = "200")
    private Integer curriculumDetailSumPeople;
    @ApiModelProperty(name = "curriculum_Id", value = "课程id", example = "1")
    private Integer curriculum_Id;
    @ApiModelProperty(name = "curriculumDetailStatus", value = "课程当前状态", example = "0")
    private Integer curriculumDetailStatus;
    @ApiModelProperty(name = "curriculumDetailMoney", value = "单节课所需金额", example = "50")
    private Double curriculumDetailMoney;
    @ApiModelProperty(name = "curriculumDetailNo", value = "当前课时序号", example = "5")
    private Integer curriculumDetailNo;

    private EntryForm entryForm;



   /* @ApiModelProperty(name = "avgWorkerScore",value = "老师平均分",example = "100")
    private Double avgWorkerScore;
    @ApiModelProperty(name = "avgCurriculumScore",value = "课程平均分",example = "100")
    private Double avgCurriculumScore;
    @ApiModelProperty(name = "avgWorkerScore",value = "老师平均分",example = "100")
    private Double totalScore;*/
}

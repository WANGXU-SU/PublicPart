package com.statics.publics.part.pojo.worker;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Curriculum implements Serializable {

    @ApiModelProperty(name = "curriculumId", value = "课程id", example = "1")
    private Integer curriculumId;

    @ApiModelProperty(name = "curriculumWorkerId", value = "课程老师", example = "丁壮")
    private String curriculumWorkerId;

    @ApiModelProperty(name = "curriculumName", value = "课程名", example = "java")
    private String curriculumName;

    @ApiModelProperty(name = "curriculumImage", value = "课程图片", example = "image.jpg")
    private String curriculumImage;

    @ApiModelProperty(name = "courseInformation", value = "课程须知", example = "如：需具备java基础")
    private String courseInformation;

    @ApiModelProperty(name = "curriculumWhatCanGrasp", value = "老师告诉你能学到什么", example = "jsp，servlet")
    private String curriculumWhatCanGrasp;

    @ApiModelProperty(name = "curriculumTotalCount", value = "课程总课时", example = "500")
    private Integer curriculumTotalCount;

    @ApiModelProperty(name = "curriculumCurrentCount", value = "课程当前课时", example = "1")
    private Integer curriculumCurrentCount;

    @ApiModelProperty(name = "curriculumOnceMoney", value = "买下整个课程套餐的费用", example = "230.0")
    private Double curriculumOnceMoney;

    @ApiModelProperty(name = "curriculumNumberOfPeople", value = "课程当前总报名人数", example = "10")
    private Integer curriculumNumberOfPeople;

    @ApiModelProperty(name = "curriculumCount", value = "课程总学习人数", example = "5")
    private Integer curriculumCount;

    @ApiModelProperty(name = "curriculumSingleNumberPeople", value = "整套课程当前报名人数", example = "5")
    private Integer curriculumSingleNumberPeople;

    @ApiModelProperty(name = "curriculumSingleSumPeople", value = "整套课程当前总学习人数", example = "5")
    private Integer curriculumSingleSumPeople;

    @ApiModelProperty(name = "curriculumLabel", value = "后台标签", example = "推荐或热门等")
    private String curriculumLabel;

    @ApiModelProperty(name = "curriculumKeyword", value = "关键词", example = "如springboot，ssm等")
    private String curriculumKeyword;

    @ApiModelProperty(name = "curriculumDescription", value = "课程简介，课程描述", example = "学习java")
    private String curriculumDescription;

    @ApiModelProperty(name = "curriculumStartTime", value = "课程时间表", example = "上午")
    private String curriculumStartTime;

    @ApiModelProperty(name = "curriculumAddress", value = "上课地址", example = "包河区")
    private String curriculumAddress;

    @ApiModelProperty(name = "curriculumLocation", value = "课程区域", example = "java")
    private Integer curriculumLocation;

    @ApiModelProperty(name = "curriculumQQ", value = "群号", example = "27988237237")
    private String curriculumQQ;

    @ApiModelProperty(name = "curriculumLanguage", value = "教授语言", example = "java")
    private Integer curriculumLanguage;

    @ApiModelProperty(name = "language", value = "内置对象language", example = "")
    private Language language;

    @ApiModelProperty(name = "location", value = "内置对象location", example = "")
    private Location location;

    @ApiModelProperty(name = "curriculumDetailList", value = "内置对象List<CurriculumDetail>", example = "")
    private List<CurriculumDetail> curriculumDetailList;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(name = "curriculumCreateTime", value = "创建时间", example = "2019-01-01 15:30")
    private Date curriculumCreateTime;

    @ApiModelProperty(name = "curriculumIsPass", value = "是否通过审核{-1未过审（默认-1），1过审", example = "-1")
    private Integer curriculumIsPass;

    @ApiModelProperty(name = "avgCurriculumScore", value = "课程平均分", example = "100")
    private Double avgCurriculumScore;

    @ApiModelProperty(name = "avgEnvironmentScore", value = "环境平均分", example = "100")
    private Double avgEnvironmentScore;

    private EntryForm entryForm;
}

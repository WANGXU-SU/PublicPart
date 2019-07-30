package com.statics.publics.part.pojo.worker;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Worker")
@Data
public class Worker implements Serializable {
    @ApiModelProperty(name = "workerId", value = "兼职者编号", example = "1")
    private String workerId;


    @ApiModelProperty(name = "workerName", value = "姓名", example = "田思桐")
    private String workerName;


    @ApiModelProperty(name = "workerNickName", value = "昵称", example = "二刚老师")
    private String workerNickName;

    @ApiModelProperty(name = "workerPhoneNumber", value = "手机号", example = "13866497399")
    private String workerPhoneNumber;

    @ApiModelProperty(name = "workerEmail", value = "邮箱", example = "13866497399@sina.cn")
    private String workerEmail;

    @ApiModelProperty(name = "workerMoney",value = "薪酬",example = "500")
    private Double workerMoney;

    @ApiModelProperty(name = "workerSignature", value = "个性签名", example = "路漫漫其修远兮，吾将上下而求索")
    private String workerSignature;

    @ApiModelProperty(name = "workerOrientation", value = "专业方向", example = "如：精通java")
    private String workerOrientation;

    @ApiModelProperty(name = "workerExperience", value = "工作经历", example = "如yyyy-MM-dd 在某公司上班")
    private String workerExperience;

    @ApiModelProperty(name = "workerInformation", value = "个人信息描述", example = "勤劳...")
    private String workerInformation;

    @ApiModelProperty(name = "workerCertificate", value = "资质证明", example = "图片...")
    private String workerCertificate;

    @ApiModelProperty(name = "workerCity", value = "所在区域", example = "合肥")
    private String workerCity;

    @ApiModelProperty(name = "workerAddress", value = "公司地址", example = "安徽,合肥")
    private String workerAddress;

    @ApiModelProperty(name = "workerStar", value = "获得的总评分", example = "99")
    private Integer workerStar;

    @ApiModelProperty(name = "workerTitle", value = "头衔", example = "1")
    private Integer workerTitle;

    @ApiModelProperty(name = "workerImage", value = "头像", example = "img/田思桐.png")
    private String workerImage;

    @ApiModelProperty(name = "workerPassword", value = "密码", example = "123456789")
    private String workerPassword;

    @ApiModelProperty(name = "curriculumList", value = "所有课程", example = "内置对象,详情见model")
    private List<Curriculum> curriculumList;

    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @ApiModelProperty(name = "curriculumCreateTime", value = "创建时间", example = "2018-10-10 15:30:20")
    private Date curriculumCreateTime;

    @ApiModelProperty(name = "workerIsPass", value = "当前状态", example = "-1未通过 0正在审核 1审核通过")
    private Integer workerIsPass;
    @ApiModelProperty(name = "avgWorkerScore", value = "老师评分", example = "-1未通过 0正在审核 1审核通过")
    private Double avgWorkerScore;


}
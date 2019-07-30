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
public class Language implements Serializable {

    @ApiModelProperty(name = "languageId",value = "语言表id",example = "1")
    private Integer languageId;
    @ApiModelProperty(name = "languageName",value = "语言名称",example = "java")
    private String languageName;
    @ApiModelProperty(name = "languageImage",value = "语言图片",example = "path")
    private String languageImage;
    @ApiModelProperty(name = "languageIsVisible",value = "是否可见（-1不可见，1可见）",example = "1")
    private Integer languageIsVisible;



}

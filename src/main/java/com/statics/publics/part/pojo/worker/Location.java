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
public class Location implements Serializable {
    @ApiModelProperty(name = "id", value = "地区id", example = "1")
    private Integer id;
    @ApiModelProperty(name = "pinyin", value = "地区拼音", example = "beijing")
    private String pinyin;
    @ApiModelProperty(name = "lng", value = "经度", example = "117.30")
    private String lng;
    @ApiModelProperty(name = "lat", value = "纬度", example = "117.30")
    private String lat;
    @ApiModelProperty(name = "level", value = "所属级别", example = "4")
    private Integer level;
    @ApiModelProperty(name = "parent_id", value = "上级id", example = "3")
    private Integer parent_id;
    @ApiModelProperty(name = "area_code", value = "地区编码", example = "1233123")
    private String area_code;
    @ApiModelProperty(name = "merger_name", value = "上级到本级的名称", example = "安徽,合肥,包河")
    private String merger_name;
    @ApiModelProperty(name = "short_name", value = "短名称", example = "包河")
    private String short_name;
    @ApiModelProperty(name = "name", value = "名称", example = "包河区")
    private String name;
    @ApiModelProperty(name = "city_code", value = "城市编码", example = "010")
    private String city_code;
    @ApiModelProperty(name = "zip_code", value = "邮政编码", example = "230000")
    private String zip_code;


}

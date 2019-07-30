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
public class Title implements Serializable {
    @ApiModelProperty(name = "titleId",value = "头衔id",example = "1")
    private Integer titleId;
    @ApiModelProperty(name = "titleName",value = "头衔名称",example = "最佳教师")
    private String titleName;
    @ApiModelProperty(name = "titleImage",value = "头衔图片",example = "https://www.baidu.com/link?url=C6sqi641_nhEfyyXQyLSvFsZjRlRBF1zTefJxOAPXAQCsb1DovJhWq5aDbasLqkVWcALiLd55wFQEoJOt9uaZB_wnkmj2uPPih52fq3r6imgt3XWIOZXSeASDfgn5OPl0GUWSPzt0TyPuG8Prn6bYP4_y4ji1roMc18uVfgeRMXasALU5-aDifxKLR_vUuBOiLXqBiGyuiglQ_RdRpdCplP6tsKdJB7IQcHi_OIeyDBome8TlSJnMuku9aD1aSBcZOfKTnsOgJw_IqEanKeiCnuHNQhjxsujaIIZRs9seKRZr0WhBOl_LMBwp4B9kNJecf_xKgeuLvI86jef3H0o2ym8Zqr3dclT28qEnq6qmHtJxzz-ReiWsHYhzVg4IQQkv_egzLNk6SfN1Dkn4YOso6AwRJAfCu_Bej77qjqgPktZH0AtztzI-_gFM7Ebk4XtQtCLRvBixjOspF-CuYZh4hZqiio5f4qopDTrC998GvxFkpomHKaKLsq2K-RVrNC5S3WkpY29zDpaQ36UVxQbN_&wd=&eqid=a9715d810013f2c3000000045d0dc786")
    private String titleImage;
    @ApiModelProperty(name = "titleConditon",value = "头衔满足条件",example = "1")
    private Integer titleConditon;
    @ApiModelProperty(name = "titleWelfare",value = "头衔福利    最小0.0,最大1.0",example = "0.6")
    private double titleWelfare;
}

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
public class CurriculumOrder implements Serializable {

    private String curriculumOrderId;
    private Integer curriculumOrderEntryId;
    private Integer curriculumOrderStuId;
    private Integer curriculumOrderCouponId;
    private Double curriculumOrderTotalPrice;
    private Double curriculumOrderDiscount;
    private Double curriculumOrderReallyPay;
    private Integer curriculumOrderIsPay;
    private String curriculumOrderPassCode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date curriculumOrderPayDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date curriculumOrderCreateDate;


}

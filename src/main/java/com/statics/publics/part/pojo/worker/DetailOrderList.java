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
public class DetailOrderList implements Serializable {
    private String detailOrderId;
    private Integer detailOrderEntryFormId;
    private Integer detailOrderStuId;
    private Integer detailOrderCouponId;
    private Double detailOrderTotalPrice;
    private Double detailOrderDiscounts;
    private Double detailOrderReallyPay;
    private Integer detailOrderIsPay;
    private String detailOrderPassCode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date detailOrderPayDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date detailOrderCreateDate;
    private String detailAliPayId;
}

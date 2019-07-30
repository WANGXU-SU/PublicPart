package com.statics.publics.part.pojo.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Withdrawal {
    private Integer withdrawal_id;
    private String worker_id;
    private String withdrawal_date;
    private Double withdrawal_money;
    private Integer withdrawal_status;
    private String withdrawal_doneTime;
}

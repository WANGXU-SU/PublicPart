package com.statics.publics.part.pojo.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GeneralResult<T> implements Serializable {

    private String code;
    private boolean success;
    private String msg;
    private T data;

}

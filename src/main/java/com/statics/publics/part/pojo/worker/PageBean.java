package com.statics.publics.part.pojo.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> implements Serializable {

    //当前页数
    private Integer currentPage;

    //总条数
    private Integer totalCount;

    //页面大小
    private Integer pageSize;

    //总页数
    private Integer totalPage;


    //数据
    private List<T> data;


}

package me.sdevil507.supports.jpa;

import lombok.Data;

import java.util.List;

/**
 * 分页返回参数封装
 *
 * @author sdevil507
 */
@Data
public class PageResultDTO<V> {

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 总页数
     */
    private Integer pages;

    /**
     * 数据列表
     */
    private List<V> records;
}

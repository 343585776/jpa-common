package me.sdevil507.jpa;

import java.util.List;

/**
 * 分页返回参数封装
 *
 * @author sdevil507
 */
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<V> getRecords() {
        return records;
    }

    public void setRecords(List<V> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "PageResultDTO{" +
                "total=" + total +
                ", pages=" + pages +
                ", records=" + records +
                '}';
    }
}

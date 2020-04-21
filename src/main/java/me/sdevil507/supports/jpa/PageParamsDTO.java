package me.sdevil507.supports.jpa;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * 分页提交参数DTO
 *
 * @author sdevil507
 */
@Data
public class PageParamsDTO {

    /**
     * 当前页码
     */
    private Integer currentPage;

    /**
     * 每页记录条数
     */
    private Integer pageSize;

    /**
     * 获取jpa中分页对象
     *
     * @return Pageable分页对象
     */
    public Pageable getPageable() {
        assert currentPage > 0;
        assert pageSize > 0;
        return PageRequest.of(currentPage - 1, pageSize);
    }

    /**
     * 获取jpa中分页对象,包含排序对象
     *
     * @param sort 排序对象
     * @return Pageable分页对象
     */
    public Pageable getPageableWithSort(Sort sort) {
        assert currentPage > 0;
        assert pageSize > 0;
        return PageRequest.of(currentPage - 1, pageSize, sort);
    }
}

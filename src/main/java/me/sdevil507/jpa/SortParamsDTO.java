package me.sdevil507.jpa;

import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

/**
 * JPA 排序提交参数DTO
 *
 * @author sdevil507
 */
public class SortParamsDTO {

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序方向
     */
    private String sortDirection;

    /**
     * 获取JPA Sort对象
     *
     * @return Sort对象
     */
    public Sort getSort() {
        if (StringUtils.isEmpty(sortField) || StringUtils.isEmpty(sortDirection)) {
            return null;
        }

        return Sort.by(Sort.Direction.fromString(sortDirection), sortField);
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public String toString() {
        return "SortParamsDTO{" +
                "sortField='" + sortField + '\'' +
                ", sortDirection='" + sortDirection + '\'' +
                '}';
    }
}

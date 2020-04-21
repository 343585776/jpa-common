package me.sdevil507.supports.jpa;

import lombok.Data;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

/**
 * JPA 排序提交参数DTO
 *
 * @author sdevil507
 */
@Data
public class SortParamsDTO {

    /**
     * 排序字段数组
     */

    private String[] sortFields;

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
        if (null == sortFields || sortFields.length < 1 || StringUtils.isEmpty(sortDirection)) {
            return null;
        }

        assert EnumUtils.isValidEnum(Sort.Direction.class, sortDirection.toUpperCase());

        return Sort.by(EnumUtils.getEnum(Sort.Direction.class, sortDirection.toUpperCase()), sortFields);
    }
}

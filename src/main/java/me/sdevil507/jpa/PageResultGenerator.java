package me.sdevil507.jpa;

import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 分页PageResultDTO对象生成器
 *
 * @author sdevil507
 */
public class PageResultGenerator {

    /**
     * 执行分页PO对象转换为自定义的DTO对象
     *
     * @param page     JPA分页获取的Page对象
     * @param callBack 回调接口
     * @param <V>      目标DTO类型
     * @param <T>      源PO类型
     * @return PageResultDTO对象
     */
    public static <V, T> PageResultDTO<V> convert(Page<T> page, PageConvertCallBack<V, T> callBack) {
        PageResultDTO<V> pageResultDTO = new PageResultDTO<>();
        pageResultDTO.setTotal(page.getTotalElements());
        pageResultDTO.setPages(page.getTotalPages());
        // 通过回调,将PO转换为DTO,一般通过mapStruct实现
        List<V> records = callBack.exec(page.getContent());
        pageResultDTO.setRecords(records);
        return pageResultDTO;
    }
}

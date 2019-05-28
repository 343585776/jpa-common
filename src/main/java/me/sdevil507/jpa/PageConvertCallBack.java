package me.sdevil507.jpa;

import java.util.List;

/**
 * 将JPA分页返回Page内getContent()函数返回的List<T>内容，通过该接口中exec()回调方法进行加工，转换为需要使用的List<V>的dto列表
 *
 * @author sdevil507
 */
public interface PageConvertCallBack<V, T> {

    /**
     * 执行回调函数,将T类型转换为V类型<br/>
     * 一般我们通过mapStruct进行转换
     *
     * @param list JPA Page 对象中content
     * @return PageResultDTO
     */
    List<V> exec(List<T> list);
}

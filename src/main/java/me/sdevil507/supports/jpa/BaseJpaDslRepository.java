package me.sdevil507.supports.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * JPA QueryDSL基础repository,合并分页,排序,条件查询,整合了QueryDSL
 *
 * @author sdevil507
 */
@NoRepositoryBean
public interface BaseJpaDslRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>, QuerydslPredicateExecutor<T> {
}

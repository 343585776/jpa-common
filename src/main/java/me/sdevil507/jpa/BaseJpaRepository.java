package me.sdevil507.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * JPA基础repository,合并分页,排序,条件查询
 *
 * @author sdevil507
 */
@NoRepositoryBean
public interface BaseJpaRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

}
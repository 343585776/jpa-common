package me.sdevil507.supports.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * JPA设置主键ID为SnowflakeId基类(加入单表审计)
 *
 * @author sdevil507
 */
@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseJpaSnowflakeIdAndAuditEntity implements Serializable {

    /**
     * 策略通用生成器,名称为sys-uuid,策略为uuid
     */
    @Id
    @GenericGenerator(name = "snowflake-id", strategy = "me.sdevil507.supports.jpa.SnowflakeIdGenerator")
    @GeneratedValue(generator = "snowflake-id")
    @Column(name = "id")
    protected Long id;

    /**
     * 创建者ID
     */
    @CreatedBy
    @Column(name = "created_by")
    protected String createdBy;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(name = "created_date")
    protected Date createdDate;

    /**
     * 最后修改者ID
     */
    @LastModifiedBy
    @Column(name = "last_modified_by")
    protected String lastModifiedBy;

    /**
     * 最后修改时间
     */
    @LastModifiedDate
    @Column(name = "last_modified_date")
    protected Date lastModifiedDate;
}

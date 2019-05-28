package me.sdevil507.jpa;

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
 * JPA设置主键ID为UUID抽象父类(加入单表审计)
 *
 * @author sdevil507
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseJpaUUIDAndAuditEntity implements Serializable {

    /**
     * 策略通用生成器,名称为sys-uuid,策略为uuid
     */
    @Id
    @GenericGenerator(name = "sys-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "sys-uuid")
    @Column(name = "id")
    protected String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}

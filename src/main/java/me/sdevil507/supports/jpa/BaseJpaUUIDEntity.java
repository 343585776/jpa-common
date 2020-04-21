package me.sdevil507.supports.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * JPA设置主键ID为UUID基类
 *
 * @author sdevil507
 */
@MappedSuperclass
@Data
public class BaseJpaUUIDEntity implements Serializable {

    /**
     * 策略通用生成器,名称为sys-uuid,策略为uuid
     */
    @Id
    @GenericGenerator(name = "sys-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "sys-uuid")
    @Column(name = "id")
    protected String id;
}

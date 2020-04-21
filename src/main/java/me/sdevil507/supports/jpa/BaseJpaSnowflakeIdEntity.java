package me.sdevil507.supports.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * JPA设置主键ID为SnowflakeId基类
 *
 * @author sdevil507
 */
@MappedSuperclass
@Data
public class BaseJpaSnowflakeIdEntity implements Serializable {

    /**
     * 策略通用生成器,名称为sys-uuid,策略为uuid
     */
    @Id
    @GenericGenerator(name = "snowflake-id", strategy = "me.sdevil507.supports.jpa.SnowflakeIdGenerator")
    @GeneratedValue(generator = "snowflake-id")
    @Column(name = "id")
    protected Long id;
}

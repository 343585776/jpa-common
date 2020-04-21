package me.sdevil507.supports.jpa;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;

/**
 * JPA-ID生成器(SnowflakeId实现)
 *
 * @author sdevil507
 */
public class SnowflakeIdGenerator extends IdentityGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor s, Object obj) {
        return SnowflakeIdHelper.get().nextId();
    }
}

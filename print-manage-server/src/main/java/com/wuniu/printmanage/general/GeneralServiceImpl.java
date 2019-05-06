package com.wuniu.printmanage.general;

import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author Yan
 */
public abstract class GeneralServiceImpl<T extends BaseEntity, PK extends Serializable>
    implements GeneralService<T, PK> {

  protected abstract Mapper<T> getMapper();


  @Override
  @Transactional(rollbackFor = Throwable.class)
  public int insert(T entity) {
    entity.setCreateTime(Instant.now().toEpochMilli());
    return getMapper().insert(entity);
  }

  @Override
  @Transactional(rollbackFor = Throwable.class)
  public int update(PK id, T entity) {
    T record = get(id);
    record.setModifiedTime(Instant.now().toEpochMilli());
    // BeanUtils.copyProperties();
    getMapper().updateByPrimaryKey(record);
    return 1;
  }

  @Override
  @Transactional(rollbackFor = Throwable.class)
  public int merge(PK id, T entity) {
    T record = get(id);
    record.setModifiedTime(Instant.now().toEpochMilli());
    // BeanUtils.copyProperties();
    getMapper().updateByPrimaryKey(record);
    return 1;
  }


  @Override
  @Transactional(rollbackFor = Throwable.class)
  public int remove(PK id) {
    return getMapper().deleteByPrimaryKey(id);
  }

  @Override
  @Transactional(readOnly = true, rollbackFor = {Throwable.class})
  public T get(PK id) {
    return getMapper().selectByPrimaryKey(id);
  }

}

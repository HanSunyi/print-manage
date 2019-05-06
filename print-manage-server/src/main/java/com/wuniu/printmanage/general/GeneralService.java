package com.wuniu.printmanage.general;

import java.io.Serializable;

/**
 * @author Yan
 */
public interface GeneralService<T extends BaseEntity, PK extends Serializable> {

  int insert(T entity);

  int update(PK id, T entity);

  int merge(PK id, T entity);

  int remove(PK id);

  T get(PK id);

  // List<T> list(Map<String, Object> params);
  //
  // int count();
  //
  // Page<T> page(int page, int limit, Map<String, Object> params);
}

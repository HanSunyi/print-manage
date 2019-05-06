package com.wuniu.printmanage.general;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Yan
 */
@Getter
@Setter
@ToString
public  class BaseEntity<PK extends Serializable> implements Serializable {
  @Id
  @Column(updatable = false)
  private PK id;
  @Column(updatable = false)
  private Long createTime;
  @Column(insertable = false)
  private Long modifiedTime;
}

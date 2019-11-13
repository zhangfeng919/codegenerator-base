package com.zhangfeng.utils.base.POJO.DTO;


import java.io.Serializable;
import java.util.List;

/**
 * 列表
 * @author zhangfeng
 * @create 2019-10-29-15:27
 **/
public class ApiListDTO<T> implements Serializable {

  private static final long serialVersionUID = -202421246278720106L;

  private Long total;

  private List<T> list;

  public ApiListDTO(Long total, List<T> list) {
    this.total = total;
    this.list = list;
  }

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }
}
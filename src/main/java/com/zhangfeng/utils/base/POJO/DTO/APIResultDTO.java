package com.zhangfeng.utils.base.POJO.DTO;


import java.io.Serializable;

/**
 * @author zhangfeng
 * @create 2019-10-15-17:07
 **/
public class APIResultDTO<T> implements Serializable {

  private static final long serialVersionUID = 1555006022735884620L;

  private String msg;

  private int code;

  private T data;

  public APIResultDTO() {
  }

  public APIResultDTO success() {
    return success(null, null);
  }

  public APIResultDTO success(String msg) {
    return success(msg, null);
  }

  public APIResultDTO success(T data) {
    return success(null, data);
  }

  public APIResultDTO success(String msg, T data) {
    APIResultDTO<T> apiResultDTO = new APIResultDTO<>();
    apiResultDTO.setCode(0);
    apiResultDTO.setMsg(msg);
    apiResultDTO.setData(data);
    return apiResultDTO;
  }

  public APIResultDTO fail() {
    return fail(null, null);
  }

  public APIResultDTO fail(String msg) {
    return fail(msg, null);
  }

  public APIResultDTO fail(T data) {
    return fail(null, data);
  }

  public APIResultDTO fail(String msg, T data) {
    APIResultDTO<T> apiResultDTO = new APIResultDTO<>();
    apiResultDTO.setCode(-1);
    apiResultDTO.setMsg(msg);
    apiResultDTO.setData(data);
    return apiResultDTO;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  private void setCode(int code) {
    this.code = code;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public boolean isSuccess(){
    return code == 0;
  }
}

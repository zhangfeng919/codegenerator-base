package com.zhangfeng.utils.base.utils;

import com.zhangfeng.utils.base.POJO.DTO.APIResultDTO;

public class ApiResultFactory {

  public static APIResultDTO success() {
    return new APIResultDTO<>().success();
  }

  public static APIResultDTO success(String msg) {
    return new APIResultDTO<>().success(msg);
  }

  public static <T> APIResultDTO<T> success(T data) {
    return new APIResultDTO<T>().success(data);
  }

  public static <T> APIResultDTO<T> success(String msg, T data) {
    return new APIResultDTO<T>().success(msg, data);
  }

  public static APIResultDTO fail() {
    return new APIResultDTO<>().fail();
  }

  public static APIResultDTO fail(String msg) {
    return new APIResultDTO<>().fail(msg);
  }

  public static <T> APIResultDTO<T> fail(T data) {
    return new APIResultDTO<T>().fail(data);
  }

  public static <T> APIResultDTO<T> fail(String msg, T data) {
    return new APIResultDTO<T>().fail(msg, data);
  }

}

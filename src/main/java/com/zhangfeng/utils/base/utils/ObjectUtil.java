package com.zhangfeng.utils.base.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zhangfeng
 * @create 2019-10-16-16:46
 **/
public class ObjectUtil {

  public static <T> T parseObject(Object object, Class<T> clazz) {
    String str = "";
    if (object == null) {
      try {
        return clazz.newInstance();
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    if (object instanceof String) {
      str = object.toString();
    } else {
      str = JSONObject.toJSONString(object);
    }
    return JSONObject.parseObject(str, clazz);
  }
}

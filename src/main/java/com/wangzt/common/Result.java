package com.wangzt.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
public class Result<T> {
    private Integer code; //编码：1成功，0和其它数字为失败

    private String errMsg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result();
        result.data = object;
        result.code = 1;
        return result;
    }

    public static <T> Result<T> error(String errMsg) {
        Result<T> result = new Result();
        result.errMsg = errMsg; //设置错误信息
        result.code = 0;  //默认失败状态码，后期我们可以根据自己的需求来设置其他状态码
        return result;
    }

    public Result<T> add(String msg, String value) {
        this.map.put(msg, value);
        return this;
    }
}

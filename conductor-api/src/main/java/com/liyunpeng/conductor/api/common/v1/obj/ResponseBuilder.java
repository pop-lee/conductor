package com.liyunpeng.conductor.api.common.v1.obj;

public class ResponseBuilder {

    public static <T> Response<T> buildSuccess(T data) {
        Response<T> response = new Response();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static <T> Response<T> buildFail(String code, String msg, T data) {
        Response<T> response = new Response();
        response.setSuccess(false);
        response.setCode(code);
        response.setMsg(msg);
        response.setData(data);
        return response;
    }
}

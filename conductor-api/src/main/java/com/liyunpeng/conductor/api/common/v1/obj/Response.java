package com.liyunpeng.conductor.api.common.v1.obj;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private boolean success;

    private String code;

    private String msg;

    private T data;

}

package com.zt.entity;

import java.io.Serializable;

/**
 * Created by MAX on 2017/7/18.
 */
public class ReturnObject<T> implements Serializable{

    private static final long serialVersionUID = 70729918754886883L;

    private int statusCode;

    private String message;

    private String errorCode;

    private T result;

    public ReturnObject() {
    }

    public ReturnObject(int statusCode, String message, String errorCode) {
        this.statusCode = statusCode;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ReturnObject(int statusCode, String message, String errorCode, T result) {
        this.statusCode = statusCode;
        this.message = message;
        this.errorCode = errorCode;
        this.result = result;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ReturnObject{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", result=" + result +
                '}';
    }
}

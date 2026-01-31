package com.ms1.ms1userservice.web.dtos.response;

import java.util.List;

public class ApiResponseDto <T>{

    private boolean success;
    private int status;
    private String message;
    private T data;
    private Object meta;
    private List<ApiError> errors;

    private ApiResponseDto() {
    }


    public static <T> ApiResponseDto<T> success(
        int status,
        String message,
        T data,
        Object meta
    ) {
        ApiResponseDto<T> response = new ApiResponseDto<>();
        response.success = true;
        response.status = status;
        response.message = message;
        response.data = data;
        response.meta = meta;
        response.errors = List.of();
        return response;
    }

    public static <T> ApiResponseDto<T> error(
        int status,
        String message,
        List<ApiError> errors
    ) {
        ApiResponseDto<T> response = new ApiResponseDto<>();
        response.success = false;
        response.status = status;
        response.message = message;
        response.data = null;
        response.meta = null;
        response.errors = errors;
        return response;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ApiError> getErrors() {
        return errors;
    }

    public void setErrors(List<ApiError> errors) {
        this.errors = errors;
    }
}

package com.ms1.ms1userservice.web.dtos.response;

import lombok.Getter;
import lombok.Setter;


public class ApiError {

    private String code;
    private String field;
    private String description;

    public ApiError(String code, String field, String description) {
        this.code = code;
        this.field = field;
        this.description = description;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


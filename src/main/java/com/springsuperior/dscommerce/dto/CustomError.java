package com.springsuperior.dscommerce.dto;

import java.time.Instant;

public class CustomError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String trace;

    public CustomError(Integer status, String error, Instant timestamp, String trace) {
        this.status = status;
        this.error = error;
        this.timestamp = timestamp;
        this.trace = trace;
    }


    public Instant getTimestamp() {
        return timestamp;
    }

    public String getError() {
        return error;
    }

    public Integer getStatus() {
        return status;
    }

    public String getTrace() {
        return trace;
    }
}

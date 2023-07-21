package com.senerunosoft.springstartproject.core.utilities.results;

public class Result {
    private boolean success;
    private String message;

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(Boolean success, String message) {
        this(success);
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}

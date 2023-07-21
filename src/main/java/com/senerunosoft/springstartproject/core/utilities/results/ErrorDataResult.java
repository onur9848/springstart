package com.senerunosoft.springstartproject.core.utilities.results;

public class ErrorDataResult<T> extends DataResults<T> {


    public ErrorDataResult(T data, String message) {
        super(false, message, data);
    }

    public ErrorDataResult(T data) {
        super(false, data);
    }

    public ErrorDataResult(String message) {
        super(false, message, null);
    }

    public ErrorDataResult() {
        super(false, null);
    }

}

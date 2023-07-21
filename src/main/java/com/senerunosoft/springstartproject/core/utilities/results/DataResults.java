package com.senerunosoft.springstartproject.core.utilities.results;

public class DataResults<T> extends Result {

    private T data;

    public DataResults(Boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }


    public DataResults(Boolean success, T data) {
        super(success);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

package com.example.ts62.retrofitdemo2.response;

import com.example.ts62.retrofitdemo2.Model.CountryResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;

public class CountryResponse {

@SerializedName("exception")
@Expose
private Object exception;
@SerializedName("result")
@Expose
private CountryResult result;

public Object getException() {
return exception;
}

public void setException(Object exception) {
this.exception = exception;
}

    public CountryResult getResult() {
        return result;
    }

    public void setResult(CountryResult result) {
        this.result = result;
    }
}
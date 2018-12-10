package com.example.ts62.retrofitdemo2.response;

import com.example.ts62.retrofitdemo2.Model.SignUpResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignUpResponse {
    public class Signup {

        @SerializedName("exception")
        @Expose
        private Object exception;
        @SerializedName("result")
        @Expose
        private SignUpResult.Result result;

        public Object getException() {
            return exception;
        }

        public void setException(Object exception) {
            this.exception = exception;
        }

        public SignUpResult.Result getResult() {
            return result;
        }

        public void setResult(SignUpResult.Result result) {
            this.result = result;
        }
    }
}

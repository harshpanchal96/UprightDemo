package com.example.ts62.retrofitdemo2.Model;

import android.content.ClipData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VehicleResponse {


        @SerializedName("exception")
        @Expose
        private Object exception;
        @SerializedName("result")
        @Expose
        private Result result;

        public Object getException() {
            return exception;
        }

        public void setException(Object exception) {
            this.exception = exception;
        }

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }


}

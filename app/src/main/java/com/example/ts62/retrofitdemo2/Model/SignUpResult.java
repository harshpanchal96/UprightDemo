package com.example.ts62.retrofitdemo2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignUpResult {
    public class Result {

        @SerializedName("items")
        @Expose
        private UserModel userModel;

        public UserModel getUserModel() {
            return userModel;
        }

        public void setUserModel(UserModel userModel) {
            this.userModel = userModel;
        }
    }
}

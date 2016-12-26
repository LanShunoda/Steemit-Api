package com.plorial.steemitapi.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Active {

    @SerializedName("weight_threshold")
    @Expose
    private Integer weightThreshold;
    @SerializedName("account_auths")
    @Expose
    private List<Object> accountAuths = null;
    @SerializedName("key_auths")
    @Expose
    private List<List<String>> keyAuths = null;

    public Integer getWeightThreshold() {
        return weightThreshold;
    }

    public void setWeightThreshold(Integer weightThreshold) {
        this.weightThreshold = weightThreshold;
    }

    public List<Object> getAccountAuths() {
        return accountAuths;
    }

    public void setAccountAuths(List<Object> accountAuths) {
        this.accountAuths = accountAuths;
    }

    public List<List<String>> getKeyAuths() {
        return keyAuths;
    }

    public void setKeyAuths(List<List<String>> keyAuths) {
        this.keyAuths = keyAuths;
    }
}

package com.plorial.steemitapi.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction {

    @SerializedName("ref_block_num")
    @Expose
    private Integer refBlockNum;
    @SerializedName("ref_block_prefix")
    @Expose
    private Integer refBlockPrefix;
    @SerializedName("expiration")
    @Expose
    private String expiration;
    @SerializedName("operations")
    @Expose
    private List<List<String>> operations = null;
    @SerializedName("extensions")
    @Expose
    private List<Object> extensions = null;
    @SerializedName("signatures")
    @Expose
    private List<String> signatures = null;

    public Integer getRefBlockNum() {
        return refBlockNum;
    }

    public void setRefBlockNum(Integer refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public Integer getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(Integer refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public List<List<String>> getOperations() {
        return operations;
    }

    public void setOperations(List<List<String>> operations) {
        this.operations = operations;
    }

    public List<Object> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Object> extensions) {
        this.extensions = extensions;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }
}

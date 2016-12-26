package com.plorial.steemitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vote {

    @SerializedName("authorperm")
    @Expose
    private String authorperm;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("rshares")
    @Expose
    private Integer rshares;
    @SerializedName("percent")
    @Expose
    private Integer percent;
    @SerializedName("time")
    @Expose
    private String time;

    public String getAuthorperm() {
        return authorperm;
    }

    public void setAuthorperm(String authorperm) {
        this.authorperm = authorperm;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getRshares() {
        return rshares;
    }

    public void setRshares(Integer rshares) {
        this.rshares = rshares;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
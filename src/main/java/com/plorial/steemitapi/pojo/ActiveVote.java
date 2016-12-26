package com.plorial.steemitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActiveVote {

    @SerializedName("voter")
    @Expose
    private String voter;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("rshares")
    @Expose
    private String rshares;
    @SerializedName("percent")
    @Expose
    private Integer percent;
    @SerializedName("reputation")
    @Expose
    private String reputation;
    @SerializedName("time")
    @Expose
    private String time;

    public String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRshares() {
        return rshares;
    }

    public void setRshares(String rshares) {
        this.rshares = rshares;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

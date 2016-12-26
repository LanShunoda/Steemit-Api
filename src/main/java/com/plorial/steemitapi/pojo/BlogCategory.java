package com.plorial.steemitapi.pojo;

/**
 * Created by plorial on 12/26/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlogCategory {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("abs_rshares")
    @Expose
    private String absRshares;
    @SerializedName("total_payouts")
    @Expose
    private String totalPayouts;
    @SerializedName("discussions")
    @Expose
    private Integer discussions;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsRshares() {
        return absRshares;
    }

    public void setAbsRshares(String absRshares) {
        this.absRshares = absRshares;
    }

    public String getTotalPayouts() {
        return totalPayouts;
    }

    public void setTotalPayouts(String totalPayouts) {
        this.totalPayouts = totalPayouts;
    }

    public Integer getDiscussions() {
        return discussions;
    }

    public void setDiscussions(Integer discussions) {
        this.discussions = discussions;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

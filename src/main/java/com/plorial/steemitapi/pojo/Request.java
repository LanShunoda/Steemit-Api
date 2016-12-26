package com.plorial.steemitapi.pojo;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("params")
    @Expose
    private JsonArray params = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public JsonArray getParams() {
        return params;
    }

    public void setParams(JsonArray params) {
        this.params = params;
    }

}

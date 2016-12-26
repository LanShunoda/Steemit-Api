package com.plorial.steemitapi.pojo;

import com.google.gson.JsonArray;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by plorial on 12/26/16.
 */
public class Response {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("result")
    @Expose
    private JsonArray result = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JsonArray getResult() {
        return result;
    }

    public void setResult(JsonArray result) {
        this.result = result;
    }
}

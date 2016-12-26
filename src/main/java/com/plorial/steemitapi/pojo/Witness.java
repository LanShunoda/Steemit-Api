package com.plorial.steemitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Witness {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("current_virtual_time")
    @Expose
    private String currentVirtualTime;
    @SerializedName("next_shuffle_block_num")
    @Expose
    private Integer nextShuffleBlockNum;
    @SerializedName("current_shuffled_witnesses")
    @Expose
    private String currentShuffledWitnesses;
    @SerializedName("num_scheduled_witnesses")
    @Expose
    private Integer numScheduledWitnesses;
    @SerializedName("top19_weight")
    @Expose
    private Integer top19Weight;
    @SerializedName("timeshare_weight")
    @Expose
    private Integer timeshareWeight;
    @SerializedName("miner_weight")
    @Expose
    private Integer minerWeight;
    @SerializedName("witness_pay_normalization_factor")
    @Expose
    private Integer witnessPayNormalizationFactor;
    @SerializedName("median_props")
    @Expose
    private MedianProps medianProps;
    @SerializedName("majority_version")
    @Expose
    private String majorityVersion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrentVirtualTime() {
        return currentVirtualTime;
    }

    public void setCurrentVirtualTime(String currentVirtualTime) {
        this.currentVirtualTime = currentVirtualTime;
    }

    public Integer getNextShuffleBlockNum() {
        return nextShuffleBlockNum;
    }

    public void setNextShuffleBlockNum(Integer nextShuffleBlockNum) {
        this.nextShuffleBlockNum = nextShuffleBlockNum;
    }

    public String getCurrentShuffledWitnesses() {
        return currentShuffledWitnesses;
    }

    public void setCurrentShuffledWitnesses(String currentShuffledWitnesses) {
        this.currentShuffledWitnesses = currentShuffledWitnesses;
    }

    public Integer getNumScheduledWitnesses() {
        return numScheduledWitnesses;
    }

    public void setNumScheduledWitnesses(Integer numScheduledWitnesses) {
        this.numScheduledWitnesses = numScheduledWitnesses;
    }

    public Integer getTop19Weight() {
        return top19Weight;
    }

    public void setTop19Weight(Integer top19Weight) {
        this.top19Weight = top19Weight;
    }

    public Integer getTimeshareWeight() {
        return timeshareWeight;
    }

    public void setTimeshareWeight(Integer timeshareWeight) {
        this.timeshareWeight = timeshareWeight;
    }

    public Integer getMinerWeight() {
        return minerWeight;
    }

    public void setMinerWeight(Integer minerWeight) {
        this.minerWeight = minerWeight;
    }

    public Integer getWitnessPayNormalizationFactor() {
        return witnessPayNormalizationFactor;
    }

    public void setWitnessPayNormalizationFactor(Integer witnessPayNormalizationFactor) {
        this.witnessPayNormalizationFactor = witnessPayNormalizationFactor;
    }

    public MedianProps getMedianProps() {
        return medianProps;
    }

    public void setMedianProps(MedianProps medianProps) {
        this.medianProps = medianProps;
    }

    public String getMajorityVersion() {
        return majorityVersion;
    }

    public void setMajorityVersion(String majorityVersion) {
        this.majorityVersion = majorityVersion;
    }
}

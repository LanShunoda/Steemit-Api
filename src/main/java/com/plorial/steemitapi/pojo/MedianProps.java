package com.plorial.steemitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MedianProps {

    @SerializedName("account_creation_fee")
    @Expose
    private String accountCreationFee;
    @SerializedName("maximum_block_size")
    @Expose
    private Integer maximumBlockSize;
    @SerializedName("sbd_interest_rate")
    @Expose
    private Integer sbdInterestRate;

    public String getAccountCreationFee() {
        return accountCreationFee;
    }

    public void setAccountCreationFee(String accountCreationFee) {
        this.accountCreationFee = accountCreationFee;
    }

    public Integer getMaximumBlockSize() {
        return maximumBlockSize;
    }

    public void setMaximumBlockSize(Integer maximumBlockSize) {
        this.maximumBlockSize = maximumBlockSize;
    }

    public Integer getSbdInterestRate() {
        return sbdInterestRate;
    }

    public void setSbdInterestRate(Integer sbdInterestRate) {
        this.sbdInterestRate = sbdInterestRate;
    }
}

package com.plorial.steemitapi.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Block {

    @SerializedName("previous")
    @Expose
    private String previous;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("witness")
    @Expose
    private String witness;
    @SerializedName("transaction_merkle_root")
    @Expose
    private String transactionMerkleRoot;
    @SerializedName("extensions")
    @Expose
    private List<Object> extensions = null;
    @SerializedName("witness_signature")
    @Expose
    private String witnessSignature;
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = null;

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    public String getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }

    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }

    public List<Object> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Object> extensions) {
        this.extensions = extensions;
    }

    public String getWitnessSignature() {
        return witnessSignature;
    }

    public void setWitnessSignature(String witnessSignature) {
        this.witnessSignature = witnessSignature;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}

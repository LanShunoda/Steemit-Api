package com.plorial.steemitapi.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("active")
    @Expose
    private Active active;
    @SerializedName("posting")
    @Expose
    private Posting posting;
    @SerializedName("memo_key")
    @Expose
    private String memoKey;
    @SerializedName("json_metadata")
    @Expose
    private String jsonMetadata;
    @SerializedName("proxy")
    @Expose
    private String proxy;
    @SerializedName("last_owner_update")
    @Expose
    private String lastOwnerUpdate;
    @SerializedName("last_account_update")
    @Expose
    private String lastAccountUpdate;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("mined")
    @Expose
    private Boolean mined;
    @SerializedName("owner_challenged")
    @Expose
    private Boolean ownerChallenged;
    @SerializedName("active_challenged")
    @Expose
    private Boolean activeChallenged;
    @SerializedName("last_owner_proved")
    @Expose
    private String lastOwnerProved;
    @SerializedName("last_active_proved")
    @Expose
    private String lastActiveProved;
    @SerializedName("recovery_account")
    @Expose
    private String recoveryAccount;
    @SerializedName("last_account_recovery")
    @Expose
    private String lastAccountRecovery;
    @SerializedName("reset_account")
    @Expose
    private String resetAccount;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("lifetime_vote_count")
    @Expose
    private Integer lifetimeVoteCount;
    @SerializedName("post_count")
    @Expose
    private Integer postCount;
    @SerializedName("can_vote")
    @Expose
    private Boolean canVote;
    @SerializedName("voting_power")
    @Expose
    private Integer votingPower;
    @SerializedName("last_vote_time")
    @Expose
    private String lastVoteTime;
    @SerializedName("balance")
    @Expose
    private String balance;
    @SerializedName("savings_balance")
    @Expose
    private String savingsBalance;
    @SerializedName("sbd_balance")
    @Expose
    private String sbdBalance;
    @SerializedName("sbd_seconds")
    @Expose
    private String sbdSeconds;
    @SerializedName("sbd_seconds_last_update")
    @Expose
    private String sbdSecondsLastUpdate;
    @SerializedName("sbd_last_interest_payment")
    @Expose
    private String sbdLastInterestPayment;
    @SerializedName("savings_sbd_balance")
    @Expose
    private String savingsSbdBalance;
    @SerializedName("savings_sbd_seconds")
    @Expose
    private String savingsSbdSeconds;
    @SerializedName("savings_sbd_seconds_last_update")
    @Expose
    private String savingsSbdSecondsLastUpdate;
    @SerializedName("savings_sbd_last_interest_payment")
    @Expose
    private String savingsSbdLastInterestPayment;
    @SerializedName("savings_withdraw_requests")
    @Expose
    private Integer savingsWithdrawRequests;
    @SerializedName("vesting_shares")
    @Expose
    private String vestingShares;
    @SerializedName("vesting_withdraw_rate")
    @Expose
    private String vestingWithdrawRate;
    @SerializedName("next_vesting_withdrawal")
    @Expose
    private String nextVestingWithdrawal;
    @SerializedName("withdrawn")
    @Expose
    private String withdrawn;
    @SerializedName("to_withdraw")
    @Expose
    private String toWithdraw;
    @SerializedName("withdraw_routes")
    @Expose
    private Integer withdrawRoutes;
    @SerializedName("curation_rewards")
    @Expose
    private Integer curationRewards;
    @SerializedName("posting_rewards")
    @Expose
    private Integer postingRewards;
    @SerializedName("proxied_vsf_votes")
    @Expose
    private List<Integer> proxiedVsfVotes = null;
    @SerializedName("witnesses_voted_for")
    @Expose
    private Integer witnessesVotedFor;
    @SerializedName("average_bandwidth")
    @Expose
    private Integer averageBandwidth;
    @SerializedName("lifetime_bandwidth")
    @Expose
    private String lifetimeBandwidth;
    @SerializedName("last_bandwidth_update")
    @Expose
    private String lastBandwidthUpdate;
    @SerializedName("average_market_bandwidth")
    @Expose
    private Integer averageMarketBandwidth;
    @SerializedName("last_market_bandwidth_update")
    @Expose
    private String lastMarketBandwidthUpdate;
    @SerializedName("last_post")
    @Expose
    private String lastPost;
    @SerializedName("last_root_post")
    @Expose
    private String lastRootPost;
    @SerializedName("post_bandwidth")
    @Expose
    private Integer postBandwidth;
    @SerializedName("vesting_balance")
    @Expose
    private String vestingBalance;
    @SerializedName("reputation")
    @Expose
    private String reputation;
    @SerializedName("transfer_history")
    @Expose
    private List<Object> transferHistory = null;
    @SerializedName("market_history")
    @Expose
    private List<Object> marketHistory = null;
    @SerializedName("post_history")
    @Expose
    private List<Object> postHistory = null;
    @SerializedName("vote_history")
    @Expose
    private List<Object> voteHistory = null;
    @SerializedName("other_history")
    @Expose
    private List<Object> otherHistory = null;
    @SerializedName("witness_votes")
    @Expose
    private List<Object> witnessVotes = null;
    @SerializedName("blog_category")
    @Expose
    private BlogCategory blogCategory;

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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Active getActive() {
        return active;
    }

    public void setActive(Active active) {
        this.active = active;
    }

    public Posting getPosting() {
        return posting;
    }

    public void setPosting(Posting posting) {
        this.posting = posting;
    }

    public String getMemoKey() {
        return memoKey;
    }

    public void setMemoKey(String memoKey) {
        this.memoKey = memoKey;
    }

    public String getJsonMetadata() {
        return jsonMetadata;
    }

    public void setJsonMetadata(String jsonMetadata) {
        this.jsonMetadata = jsonMetadata;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getLastOwnerUpdate() {
        return lastOwnerUpdate;
    }

    public void setLastOwnerUpdate(String lastOwnerUpdate) {
        this.lastOwnerUpdate = lastOwnerUpdate;
    }

    public String getLastAccountUpdate() {
        return lastAccountUpdate;
    }

    public void setLastAccountUpdate(String lastAccountUpdate) {
        this.lastAccountUpdate = lastAccountUpdate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Boolean getMined() {
        return mined;
    }

    public void setMined(Boolean mined) {
        this.mined = mined;
    }

    public Boolean getOwnerChallenged() {
        return ownerChallenged;
    }

    public void setOwnerChallenged(Boolean ownerChallenged) {
        this.ownerChallenged = ownerChallenged;
    }

    public Boolean getActiveChallenged() {
        return activeChallenged;
    }

    public void setActiveChallenged(Boolean activeChallenged) {
        this.activeChallenged = activeChallenged;
    }

    public String getLastOwnerProved() {
        return lastOwnerProved;
    }

    public void setLastOwnerProved(String lastOwnerProved) {
        this.lastOwnerProved = lastOwnerProved;
    }

    public String getLastActiveProved() {
        return lastActiveProved;
    }

    public void setLastActiveProved(String lastActiveProved) {
        this.lastActiveProved = lastActiveProved;
    }

    public String getRecoveryAccount() {
        return recoveryAccount;
    }

    public void setRecoveryAccount(String recoveryAccount) {
        this.recoveryAccount = recoveryAccount;
    }

    public String getLastAccountRecovery() {
        return lastAccountRecovery;
    }

    public void setLastAccountRecovery(String lastAccountRecovery) {
        this.lastAccountRecovery = lastAccountRecovery;
    }

    public String getResetAccount() {
        return resetAccount;
    }

    public void setResetAccount(String resetAccount) {
        this.resetAccount = resetAccount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getLifetimeVoteCount() {
        return lifetimeVoteCount;
    }

    public void setLifetimeVoteCount(Integer lifetimeVoteCount) {
        this.lifetimeVoteCount = lifetimeVoteCount;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Boolean getCanVote() {
        return canVote;
    }

    public void setCanVote(Boolean canVote) {
        this.canVote = canVote;
    }

    public Integer getVotingPower() {
        return votingPower;
    }

    public void setVotingPower(Integer votingPower) {
        this.votingPower = votingPower;
    }

    public String getLastVoteTime() {
        return lastVoteTime;
    }

    public void setLastVoteTime(String lastVoteTime) {
        this.lastVoteTime = lastVoteTime;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(String savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public String getSbdBalance() {
        return sbdBalance;
    }

    public void setSbdBalance(String sbdBalance) {
        this.sbdBalance = sbdBalance;
    }

    public String getSbdSeconds() {
        return sbdSeconds;
    }

    public void setSbdSeconds(String sbdSeconds) {
        this.sbdSeconds = sbdSeconds;
    }

    public String getSbdSecondsLastUpdate() {
        return sbdSecondsLastUpdate;
    }

    public void setSbdSecondsLastUpdate(String sbdSecondsLastUpdate) {
        this.sbdSecondsLastUpdate = sbdSecondsLastUpdate;
    }

    public String getSbdLastInterestPayment() {
        return sbdLastInterestPayment;
    }

    public void setSbdLastInterestPayment(String sbdLastInterestPayment) {
        this.sbdLastInterestPayment = sbdLastInterestPayment;
    }

    public String getSavingsSbdBalance() {
        return savingsSbdBalance;
    }

    public void setSavingsSbdBalance(String savingsSbdBalance) {
        this.savingsSbdBalance = savingsSbdBalance;
    }

    public String getSavingsSbdSeconds() {
        return savingsSbdSeconds;
    }

    public void setSavingsSbdSeconds(String savingsSbdSeconds) {
        this.savingsSbdSeconds = savingsSbdSeconds;
    }

    public String getSavingsSbdSecondsLastUpdate() {
        return savingsSbdSecondsLastUpdate;
    }

    public void setSavingsSbdSecondsLastUpdate(String savingsSbdSecondsLastUpdate) {
        this.savingsSbdSecondsLastUpdate = savingsSbdSecondsLastUpdate;
    }

    public String getSavingsSbdLastInterestPayment() {
        return savingsSbdLastInterestPayment;
    }

    public void setSavingsSbdLastInterestPayment(String savingsSbdLastInterestPayment) {
        this.savingsSbdLastInterestPayment = savingsSbdLastInterestPayment;
    }

    public Integer getSavingsWithdrawRequests() {
        return savingsWithdrawRequests;
    }

    public void setSavingsWithdrawRequests(Integer savingsWithdrawRequests) {
        this.savingsWithdrawRequests = savingsWithdrawRequests;
    }

    public String getVestingShares() {
        return vestingShares;
    }

    public void setVestingShares(String vestingShares) {
        this.vestingShares = vestingShares;
    }

    public String getVestingWithdrawRate() {
        return vestingWithdrawRate;
    }

    public void setVestingWithdrawRate(String vestingWithdrawRate) {
        this.vestingWithdrawRate = vestingWithdrawRate;
    }

    public String getNextVestingWithdrawal() {
        return nextVestingWithdrawal;
    }

    public void setNextVestingWithdrawal(String nextVestingWithdrawal) {
        this.nextVestingWithdrawal = nextVestingWithdrawal;
    }

    public String getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(String withdrawn) {
        this.withdrawn = withdrawn;
    }

    public String getToWithdraw() {
        return toWithdraw;
    }

    public void setToWithdraw(String toWithdraw) {
        this.toWithdraw = toWithdraw;
    }

    public Integer getWithdrawRoutes() {
        return withdrawRoutes;
    }

    public void setWithdrawRoutes(Integer withdrawRoutes) {
        this.withdrawRoutes = withdrawRoutes;
    }

    public Integer getCurationRewards() {
        return curationRewards;
    }

    public void setCurationRewards(Integer curationRewards) {
        this.curationRewards = curationRewards;
    }

    public Integer getPostingRewards() {
        return postingRewards;
    }

    public void setPostingRewards(Integer postingRewards) {
        this.postingRewards = postingRewards;
    }

    public List<Integer> getProxiedVsfVotes() {
        return proxiedVsfVotes;
    }

    public void setProxiedVsfVotes(List<Integer> proxiedVsfVotes) {
        this.proxiedVsfVotes = proxiedVsfVotes;
    }

    public Integer getWitnessesVotedFor() {
        return witnessesVotedFor;
    }

    public void setWitnessesVotedFor(Integer witnessesVotedFor) {
        this.witnessesVotedFor = witnessesVotedFor;
    }

    public Integer getAverageBandwidth() {
        return averageBandwidth;
    }

    public void setAverageBandwidth(Integer averageBandwidth) {
        this.averageBandwidth = averageBandwidth;
    }

    public String getLifetimeBandwidth() {
        return lifetimeBandwidth;
    }

    public void setLifetimeBandwidth(String lifetimeBandwidth) {
        this.lifetimeBandwidth = lifetimeBandwidth;
    }

    public String getLastBandwidthUpdate() {
        return lastBandwidthUpdate;
    }

    public void setLastBandwidthUpdate(String lastBandwidthUpdate) {
        this.lastBandwidthUpdate = lastBandwidthUpdate;
    }

    public Integer getAverageMarketBandwidth() {
        return averageMarketBandwidth;
    }

    public void setAverageMarketBandwidth(Integer averageMarketBandwidth) {
        this.averageMarketBandwidth = averageMarketBandwidth;
    }

    public String getLastMarketBandwidthUpdate() {
        return lastMarketBandwidthUpdate;
    }

    public void setLastMarketBandwidthUpdate(String lastMarketBandwidthUpdate) {
        this.lastMarketBandwidthUpdate = lastMarketBandwidthUpdate;
    }

    public String getLastPost() {
        return lastPost;
    }

    public void setLastPost(String lastPost) {
        this.lastPost = lastPost;
    }

    public String getLastRootPost() {
        return lastRootPost;
    }

    public void setLastRootPost(String lastRootPost) {
        this.lastRootPost = lastRootPost;
    }

    public Integer getPostBandwidth() {
        return postBandwidth;
    }

    public void setPostBandwidth(Integer postBandwidth) {
        this.postBandwidth = postBandwidth;
    }

    public String getVestingBalance() {
        return vestingBalance;
    }

    public void setVestingBalance(String vestingBalance) {
        this.vestingBalance = vestingBalance;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public List<Object> getTransferHistory() {
        return transferHistory;
    }

    public void setTransferHistory(List<Object> transferHistory) {
        this.transferHistory = transferHistory;
    }

    public List<Object> getMarketHistory() {
        return marketHistory;
    }

    public void setMarketHistory(List<Object> marketHistory) {
        this.marketHistory = marketHistory;
    }

    public List<Object> getPostHistory() {
        return postHistory;
    }

    public void setPostHistory(List<Object> postHistory) {
        this.postHistory = postHistory;
    }

    public List<Object> getVoteHistory() {
        return voteHistory;
    }

    public void setVoteHistory(List<Object> voteHistory) {
        this.voteHistory = voteHistory;
    }

    public List<Object> getOtherHistory() {
        return otherHistory;
    }

    public void setOtherHistory(List<Object> otherHistory) {
        this.otherHistory = otherHistory;
    }

    public List<Object> getWitnessVotes() {
        return witnessVotes;
    }

    public void setWitnessVotes(List<Object> witnessVotes) {
        this.witnessVotes = witnessVotes;
    }

    public BlogCategory getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }
}

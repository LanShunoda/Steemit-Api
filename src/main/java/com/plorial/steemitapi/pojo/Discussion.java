package com.plorial.steemitapi.pojo;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Discussion {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("permlink")
    @Expose
    private String permlink;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("parent_author")
    @Expose
    private String parentAuthor;
    @SerializedName("parent_permlink")
    @Expose
    private String parentPermlink;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("json_metadata")
    @Expose
    private String jsonMetadata;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("last_payout")
    @Expose
    private String lastPayout;
    @SerializedName("depth")
    @Expose
    private Integer depth;
    @SerializedName("children")
    @Expose
    private Integer children;
    @SerializedName("children_rshares2")
    @Expose
    private String childrenRshares2;
    @SerializedName("net_rshares")
    @Expose
    private String netRshares;
    @SerializedName("abs_rshares")
    @Expose
    private String absRshares;
    @SerializedName("vote_rshares")
    @Expose
    private String voteRshares;
    @SerializedName("children_abs_rshares")
    @Expose
    private String childrenAbsRshares;
    @SerializedName("cashout_time")
    @Expose
    private String cashoutTime;
    @SerializedName("max_cashout_time")
    @Expose
    private String maxCashoutTime;
    @SerializedName("total_vote_weight")
    @Expose
    private String totalVoteWeight;
    @SerializedName("reward_weight")
    @Expose
    private Integer rewardWeight;
    @SerializedName("total_payout_value")
    @Expose
    private String totalPayoutValue;
    @SerializedName("curator_payout_value")
    @Expose
    private String curatorPayoutValue;
    @SerializedName("author_rewards")
    @Expose
    private Integer authorRewards;
    @SerializedName("net_votes")
    @Expose
    private Integer netVotes;
    @SerializedName("root_comment")
    @Expose
    private Integer rootComment;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("max_accepted_payout")
    @Expose
    private String maxAcceptedPayout;
    @SerializedName("percent_steem_dollars")
    @Expose
    private Integer percentSteemDollars;
    @SerializedName("allow_replies")
    @Expose
    private Boolean allowReplies;
    @SerializedName("allow_votes")
    @Expose
    private Boolean allowVotes;
    @SerializedName("allow_curation_rewards")
    @Expose
    private Boolean allowCurationRewards;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("root_title")
    @Expose
    private String rootTitle;
    @SerializedName("pending_payout_value")
    @Expose
    private String pendingPayoutValue;
    @SerializedName("total_pending_payout_value")
    @Expose
    private String totalPendingPayoutValue;
    @SerializedName("active_votes")
    @Expose
    private List<ActiveVote> activeVotes = null;
    @SerializedName("replies")
    @Expose
    private List<Object> replies = null;
    @SerializedName("author_reputation")
    @Expose
    private String authorReputation;
    @SerializedName("promoted")
    @Expose
    private String promoted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPermlink() {
        return permlink;
    }

    public void setPermlink(String permlink) {
        this.permlink = permlink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParentAuthor() {
        return parentAuthor;
    }

    public void setParentAuthor(String parentAuthor) {
        this.parentAuthor = parentAuthor;
    }

    public String getParentPermlink() {
        return parentPermlink;
    }

    public void setParentPermlink(String parentPermlink) {
        this.parentPermlink = parentPermlink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getJsonMetadata() {
        return jsonMetadata;
    }

    public void setJsonMetadata(String jsonMetadata) {
        this.jsonMetadata = jsonMetadata;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLastPayout() {
        return lastPayout;
    }

    public void setLastPayout(String lastPayout) {
        this.lastPayout = lastPayout;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public String getChildrenRshares2() {
        return childrenRshares2;
    }

    public void setChildrenRshares2(String childrenRshares2) {
        this.childrenRshares2 = childrenRshares2;
    }

    public String getNetRshares() {
        return netRshares;
    }

    public void setNetRshares(String netRshares) {
        this.netRshares = netRshares;
    }

    public String getAbsRshares() {
        return absRshares;
    }

    public void setAbsRshares(String absRshares) {
        this.absRshares = absRshares;
    }

    public String getVoteRshares() {
        return voteRshares;
    }

    public void setVoteRshares(String voteRshares) {
        this.voteRshares = voteRshares;
    }

    public String getChildrenAbsRshares() {
        return childrenAbsRshares;
    }

    public void setChildrenAbsRshares(String childrenAbsRshares) {
        this.childrenAbsRshares = childrenAbsRshares;
    }

    public String getCashoutTime() {
        return cashoutTime;
    }

    public void setCashoutTime(String cashoutTime) {
        this.cashoutTime = cashoutTime;
    }

    public String getMaxCashoutTime() {
        return maxCashoutTime;
    }

    public void setMaxCashoutTime(String maxCashoutTime) {
        this.maxCashoutTime = maxCashoutTime;
    }

    public String getTotalVoteWeight() {
        return totalVoteWeight;
    }

    public void setTotalVoteWeight(String totalVoteWeight) {
        this.totalVoteWeight = totalVoteWeight;
    }

    public Integer getRewardWeight() {
        return rewardWeight;
    }

    public void setRewardWeight(Integer rewardWeight) {
        this.rewardWeight = rewardWeight;
    }

    public String getTotalPayoutValue() {
        return totalPayoutValue;
    }

    public void setTotalPayoutValue(String totalPayoutValue) {
        this.totalPayoutValue = totalPayoutValue;
    }

    public String getCuratorPayoutValue() {
        return curatorPayoutValue;
    }

    public void setCuratorPayoutValue(String curatorPayoutValue) {
        this.curatorPayoutValue = curatorPayoutValue;
    }

    public Integer getAuthorRewards() {
        return authorRewards;
    }

    public void setAuthorRewards(Integer authorRewards) {
        this.authorRewards = authorRewards;
    }

    public Integer getNetVotes() {
        return netVotes;
    }

    public void setNetVotes(Integer netVotes) {
        this.netVotes = netVotes;
    }

    public Integer getRootComment() {
        return rootComment;
    }

    public void setRootComment(Integer rootComment) {
        this.rootComment = rootComment;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMaxAcceptedPayout() {
        return maxAcceptedPayout;
    }

    public void setMaxAcceptedPayout(String maxAcceptedPayout) {
        this.maxAcceptedPayout = maxAcceptedPayout;
    }

    public Integer getPercentSteemDollars() {
        return percentSteemDollars;
    }

    public void setPercentSteemDollars(Integer percentSteemDollars) {
        this.percentSteemDollars = percentSteemDollars;
    }

    public Boolean getAllowReplies() {
        return allowReplies;
    }

    public void setAllowReplies(Boolean allowReplies) {
        this.allowReplies = allowReplies;
    }

    public Boolean getAllowVotes() {
        return allowVotes;
    }

    public void setAllowVotes(Boolean allowVotes) {
        this.allowVotes = allowVotes;
    }

    public Boolean getAllowCurationRewards() {
        return allowCurationRewards;
    }

    public void setAllowCurationRewards(Boolean allowCurationRewards) {
        this.allowCurationRewards = allowCurationRewards;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRootTitle() {
        return rootTitle;
    }

    public void setRootTitle(String rootTitle) {
        this.rootTitle = rootTitle;
    }

    public String getPendingPayoutValue() {
        return pendingPayoutValue;
    }

    public void setPendingPayoutValue(String pendingPayoutValue) {
        this.pendingPayoutValue = pendingPayoutValue;
    }

    public String getTotalPendingPayoutValue() {
        return totalPendingPayoutValue;
    }

    public void setTotalPendingPayoutValue(String totalPendingPayoutValue) {
        this.totalPendingPayoutValue = totalPendingPayoutValue;
    }

    public List<ActiveVote> getActiveVotes() {
        return activeVotes;
    }

    public void setActiveVotes(List<ActiveVote> activeVotes) {
        this.activeVotes = activeVotes;
    }

    public List<Object> getReplies() {
        return replies;
    }

    public void setReplies(List<Object> replies) {
        this.replies = replies;
    }

    public String getAuthorReputation() {
        return authorReputation;
    }

    public void setAuthorReputation(String authorReputation) {
        this.authorReputation = authorReputation;
    }

    public String getPromoted() {
        return promoted;
    }

    public void setPromoted(String promoted) {
        this.promoted = promoted;
    }
}

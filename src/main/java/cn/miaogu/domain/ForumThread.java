package cn.miaogu.domain;

public class ForumThread {
    private Integer tid;

    private Integer fid;

    private Short posttableid;

    private Short typeid;

    private Short sortid;

    private Byte readperm;

    private Short price;

    private String author;

    private Integer authorid;

    private String subject;

    private Integer dateline;

    private Integer lastpost;

    private String lastposter;

    private Integer views;

    private Integer replies;

    private Boolean displayorder;

    private Boolean highlight;

    private Boolean digest;

    private Boolean rate;

    private Boolean special;

    private Boolean attachment;

    private Boolean moderated;

    private Integer closed;

    private Boolean stickreply;

    private Short recommends;

    private Short recommendAdd;

    private Short recommendSub;

    private Integer heats;

    private Short status;

    private Boolean isgroup;

    private Integer favtimes;

    private Integer sharetimes;

    private Byte stamp;

    private Byte icon;

    private Integer pushedaid;

    private Short cover;

    private Short replycredit;

    private String relatebytag;

    private Integer maxposition;

    private String bgcolor;

    private Integer comments;

    private Short hidden;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Short getPosttableid() {
        return posttableid;
    }

    public void setPosttableid(Short posttableid) {
        this.posttableid = posttableid;
    }

    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
    }

    public Short getSortid() {
        return sortid;
    }

    public void setSortid(Short sortid) {
        this.sortid = sortid;
    }

    public Byte getReadperm() {
        return readperm;
    }

    public void setReadperm(Byte readperm) {
        this.readperm = readperm;
    }

    public Short getPrice() {
        return price;
    }

    public void setPrice(Short price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    public Integer getLastpost() {
        return lastpost;
    }

    public void setLastpost(Integer lastpost) {
        this.lastpost = lastpost;
    }

    public String getLastposter() {
        return lastposter;
    }

    public void setLastposter(String lastposter) {
        this.lastposter = lastposter == null ? null : lastposter.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    public Boolean getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Boolean displayorder) {
        this.displayorder = displayorder;
    }

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public Boolean getDigest() {
        return digest;
    }

    public void setDigest(Boolean digest) {
        this.digest = digest;
    }

    public Boolean getRate() {
        return rate;
    }

    public void setRate(Boolean rate) {
        this.rate = rate;
    }

    public Boolean getSpecial() {
        return special;
    }

    public void setSpecial(Boolean special) {
        this.special = special;
    }

    public Boolean getAttachment() {
        return attachment;
    }

    public void setAttachment(Boolean attachment) {
        this.attachment = attachment;
    }

    public Boolean getModerated() {
        return moderated;
    }

    public void setModerated(Boolean moderated) {
        this.moderated = moderated;
    }

    public Integer getClosed() {
        return closed;
    }

    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    public Boolean getStickreply() {
        return stickreply;
    }

    public void setStickreply(Boolean stickreply) {
        this.stickreply = stickreply;
    }

    public Short getRecommends() {
        return recommends;
    }

    public void setRecommends(Short recommends) {
        this.recommends = recommends;
    }

    public Short getRecommendAdd() {
        return recommendAdd;
    }

    public void setRecommendAdd(Short recommendAdd) {
        this.recommendAdd = recommendAdd;
    }

    public Short getRecommendSub() {
        return recommendSub;
    }

    public void setRecommendSub(Short recommendSub) {
        this.recommendSub = recommendSub;
    }

    public Integer getHeats() {
        return heats;
    }

    public void setHeats(Integer heats) {
        this.heats = heats;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Boolean getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(Boolean isgroup) {
        this.isgroup = isgroup;
    }

    public Integer getFavtimes() {
        return favtimes;
    }

    public void setFavtimes(Integer favtimes) {
        this.favtimes = favtimes;
    }

    public Integer getSharetimes() {
        return sharetimes;
    }

    public void setSharetimes(Integer sharetimes) {
        this.sharetimes = sharetimes;
    }

    public Byte getStamp() {
        return stamp;
    }

    public void setStamp(Byte stamp) {
        this.stamp = stamp;
    }

    public Byte getIcon() {
        return icon;
    }

    public void setIcon(Byte icon) {
        this.icon = icon;
    }

    public Integer getPushedaid() {
        return pushedaid;
    }

    public void setPushedaid(Integer pushedaid) {
        this.pushedaid = pushedaid;
    }

    public Short getCover() {
        return cover;
    }

    public void setCover(Short cover) {
        this.cover = cover;
    }

    public Short getReplycredit() {
        return replycredit;
    }

    public void setReplycredit(Short replycredit) {
        this.replycredit = replycredit;
    }

    public String getRelatebytag() {
        return relatebytag;
    }

    public void setRelatebytag(String relatebytag) {
        this.relatebytag = relatebytag == null ? null : relatebytag.trim();
    }

    public Integer getMaxposition() {
        return maxposition;
    }

    public void setMaxposition(Integer maxposition) {
        this.maxposition = maxposition;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor == null ? null : bgcolor.trim();
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Short getHidden() {
        return hidden;
    }

    public void setHidden(Short hidden) {
        this.hidden = hidden;
    }
}
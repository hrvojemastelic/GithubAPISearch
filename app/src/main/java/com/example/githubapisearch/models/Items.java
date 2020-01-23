package com.example.githubapisearch.models;

import android.graphics.Movie;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class Items implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("master_branch")
    @Expose
    private String masterBranch;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @SerializedName("score")
    @Expose
    private Double score;

    public Items(Integer id, String nodeId, String name, String fullName, Owner owner, Boolean _private, String htmlUrl, String description, Boolean fork, String url, String createdAt, String updatedAt, String pushedAt, String homepage, Integer size, Integer stargazersCount, Integer watchersCount, String language, Integer forksCount, Integer openIssuesCount, String masterBranch, String defaultBranch, Double score) {
        this.id=id;
        this.nodeId=nodeId;
        this.name=name;
        this.fullName=fullName;
        this.owner=owner;
        this._private=_private;
        this.htmlUrl=htmlUrl;
        this.description=description;
        this.fork=fork;
        this.url=url;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
        this.pushedAt=pushedAt;
        this.homepage=homepage;
        this.size=size;
        this.stargazersCount=stargazersCount;
        this.watchersCount=watchersCount;
        this.language=language;
        this.forksCount=forksCount;
        this.openIssuesCount=openIssuesCount;
        this.masterBranch=masterBranch;
        this.defaultBranch=defaultBranch;
        this.score=score;
    }

    public Items() {
    }


    protected Items(Parcel in) {
        if (in.readByte() == 0) {
            id=null;
        } else {
            id=in.readInt();
        }
        nodeId=in.readString();
        name=in.readString();
        fullName=in.readString();
        byte tmp_private=in.readByte();
        _private=tmp_private == 0 ? null : tmp_private == 1;
        htmlUrl=in.readString();
        description=in.readString();
        byte tmpFork=in.readByte();
        fork=tmpFork == 0 ? null : tmpFork == 1;
        url=in.readString();
        createdAt=in.readString();
        updatedAt=in.readString();
        pushedAt=in.readString();
        homepage=in.readString();
        if (in.readByte() == 0) {
            size=null;
        } else {
            size=in.readInt();
        }
        if (in.readByte() == 0) {
            stargazersCount=null;
        } else {
            stargazersCount=in.readInt();
        }
        if (in.readByte() == 0) {
            watchersCount=null;
        } else {
            watchersCount=in.readInt();
        }
        language=in.readString();
        if (in.readByte() == 0) {
            forksCount=null;
        } else {
            forksCount=in.readInt();
        }
        if (in.readByte() == 0) {
            openIssuesCount=null;
        } else {
            openIssuesCount=in.readInt();
        }
        masterBranch=in.readString();
        defaultBranch=in.readString();
        if (in.readByte() == 0) {
            score=null;
        } else {
            score=in.readDouble();
        }
    }

    public static final Creator<Items> CREATOR=new Creator<Items>() {
        @Override
        public Items createFromParcel(Parcel in) {
            return new Items(in);
        }

        @Override
        public Items[] newArray(int size) {
            return new Items[size];
        }
    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public String getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeString(nodeId);
        dest.writeString(name);
        dest.writeString(fullName);
        dest.writeByte((byte) (_private == null ? 0 : _private ? 1 : 2));
        dest.writeString(htmlUrl);
        dest.writeString(description);
        dest.writeByte((byte) (fork == null ? 0 : fork ? 1 : 2));
        dest.writeString(url);
        dest.writeString(createdAt);
        dest.writeString(updatedAt);
        dest.writeString(pushedAt);
        dest.writeString(homepage);
        if (size == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(size);
        }
        if (stargazersCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(stargazersCount);
        }
        if (watchersCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(watchersCount);
        }
        dest.writeString(language);
        if (forksCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(forksCount);
        }
        if (openIssuesCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(openIssuesCount);
        }
        dest.writeString(masterBranch);
        dest.writeString(defaultBranch);
        if (score == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(score);
        }
    }
}

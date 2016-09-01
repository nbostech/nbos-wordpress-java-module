package com.nbos.capi.modules.wordpress.v0.models.blog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashkumar on 5/15/2016.
 */
public class BlogPost implements Serializable{

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("date")
        @Expose(serialize = false,deserialize = false)
        private String date;
        @SerializedName("date_gmt")
        @Expose(serialize = false,deserialize = false)
        private String dateGmt;
        @SerializedName("guid")
        @Expose(serialize = false,deserialize = false)
        private RenderProp guid;
        @SerializedName("modified")
        @Expose(serialize = false,deserialize = false)
        private String modified;
        @SerializedName("modified_gmt")
        @Expose(serialize = false,deserialize = false)
        private String modifiedGmt;
        @SerializedName("slug")
        @Expose(serialize = false,deserialize = false)
        private String slug;
        @SerializedName("type")
        @Expose(serialize = false,deserialize = false)
        private String type;
        @SerializedName("link")
        @Expose(serialize = false,deserialize = false)
        private String link;
        @SerializedName("feature_image")
        @Expose
        private BlogFeatureImage featureImage;
        @SerializedName("ask_astrologer")
        @Expose(serialize = false,deserialize = false)
        private List<String> askAstrologer = new ArrayList<>();
        @SerializedName("title")
        @Expose
        private RenderProp title;
        @SerializedName("content")
        @Expose
        private RenderProp content;
        @SerializedName("excerpt")
        @Expose(serialize = false,deserialize = false)
        private RenderProp excerpt;
        @SerializedName("author")
        @Expose(serialize = false,deserialize = false)
        private Long author;
        @SerializedName("featured_media")
        @Expose(serialize = false,deserialize = false)
        private Long featuredMedia;
        @SerializedName("comment_status")
        @Expose(serialize = false,deserialize = false)
        private String commentStatus;
        @SerializedName("ping_status")
        @Expose(serialize = false,deserialize = false)
        private String pingStatus;
        @SerializedName("sticky")
        @Expose(serialize = false,deserialize = false)
        private Boolean sticky;
        @SerializedName("format")
        @Expose(serialize = false,deserialize = false)
        private String format;
        @SerializedName("categories")
        @Expose(serialize = false,deserialize = false)
        private List<Long> categories = new ArrayList<>();
        @SerializedName("tags")
        @Expose(serialize = false,deserialize = false)
        private List<Long> tags = new ArrayList<>();
        @SerializedName("tag_names")
        @Expose(serialize = false,deserialize = false)
        private Object tagNames;
        @SerializedName("_links")
        @Expose(serialize = false,deserialize = false)
        private Object Links;
        @SerializedName("post_title")
        @Expose
        private String postTitle;

/**
 *
 * @return
 * The id
 */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The dateGmt
     */
    public String getDateGmt() {
        return dateGmt;
    }

    /**
     *
     * @param dateGmt
     * The date_gmt
     */
    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    /**
     *
     * @return
     * The guid
     */
    public RenderProp getGuid() {
        return guid;
    }

    /**
     *
     * @param guid
     * The guid
     */
    public void setGuid(RenderProp guid) {
        this.guid = guid;
    }

    /**
     *
     * @return
     * The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The modifiedGmt
     */
    public String getModifiedGmt() {
        return modifiedGmt;
    }

    /**
     *
     * @param modifiedGmt
     * The modified_gmt
     */
    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    /**
     *
     * @return
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The featureImage
     */
    public BlogFeatureImage getFeatureImage() {
        return featureImage;
    }

    /**
     *
     * @param featureImage
     * The feature_image
     */
    public void setFeatureImage(BlogFeatureImage featureImage) {
        this.featureImage = featureImage;
    }

    /**
     *
     * @return
     * The askAstrologer
     */
    public List<String> getAskAstrologer() {
        return askAstrologer;
    }

    /**
     *
     * @param askAstrologer
     * The ask_astrologer
     */
    public void setAskAstrologer(List<String> askAstrologer) {
        this.askAstrologer = askAstrologer;
    }

    /**
     *
     * @return
     * The title
     */
    public RenderProp getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(RenderProp title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The content
     */
    public RenderProp getContent() {
        return content;
    }

    /**
     *
     * @param content
     * The content
     */
    public void setContent(RenderProp content) {
        this.content = content;
    }

    /**
     *
     * @return
     * The excerpt
     */
    public RenderProp getExcerpt() {
        return excerpt;
    }

    /**
     *
     * @param excerpt
     * The excerpt
     */
    public void setExcerpt(RenderProp excerpt) {
        this.excerpt = excerpt;
    }

    /**
     *
     * @return
     * The author
     */
    public Long getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(Long author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The featuredMedia
     */
    public Long getFeaturedMedia() {
        return featuredMedia;
    }

    /**
     *
     * @param featuredMedia
     * The featured_media
     */
    public void setFeaturedMedia(Long featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    /**
     *
     * @return
     * The commentStatus
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     *
     * @param commentStatus
     * The comment_status
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     *
     * @return
     * The pingStatus
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     *
     * @param pingStatus
     * The ping_status
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     *
     * @return
     * The sticky
     */
    public Boolean getSticky() {
        return sticky;
    }

    /**
     *
     * @param sticky
     * The sticky
     */
    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    /**
     *
     * @return
     * The format
     */
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param format
     * The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     *
     * @return
     * The categories
     */
    public List<Long> getCategories() {
        return categories;
    }

    /**
     *
     * @param categories
     * The categories
     */
    public void setCategories(List<Long> categories) {
        this.categories = categories;
    }

    /**
     *
     * @return
     * The tags
     */
    public List<Long> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(List<Long> tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The tagNames
     */
    public Object getTagNames() {
        return tagNames;
    }

    /**
     *
     * @param tagNames
     * The tag_names
     */
    public void setTagNames(Object tagNames) {
        this.tagNames = tagNames;
    }

    /**
     *
     * @return
     * The Links
     */
    public Object getLinks() {
        return Links;
    }

    /**
     *
     * @param Links
     * The _links
     */
    public void setLinks(Object Links) {
        this.Links = Links;
    }

    /**
     *
     * @return
     * The postTitle
     */
    public String getPostTitle() {
        return postTitle;
    }

    /**
     *
     * @param postTitle
     * The post_title
     */
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }


}

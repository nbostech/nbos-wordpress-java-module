package com.nbos.capi.modules.wordpress.v0.models.blog;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vivekkiran on 8/15/16.
 */

public class LinksModel {
    List<SelfModel> self;

    public List<CollectionModel> getCollection() {
        return collection;
    }

    public List<SelfModel> getSelf() {
        return self;
    }

    public List<AboutModel> getAbout() {
        return about;
    }

    public List<UpModel> getUp() {
        return up;
    }

    public List<PostTypeModel> getPostType() {
        return postType;
    }

    List<CollectionModel> collection;
    List<AboutModel> about;
    List<UpModel> up;
    @SerializedName("http://api.w.org/v2/post_type")
    List<PostTypeModel> postType;
}

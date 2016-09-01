package com.nbos.capi.modules.wordpress.v0.models.blog;

import java.io.Serializable;

/**
 * Created by ashkumar on 6/21/2016.
 */

public class BlogPostPart implements Serializable{

    public String title;
    public String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

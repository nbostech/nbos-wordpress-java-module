package io.nbos.capi.modules.wordpress.v0.models.blog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ashkumar on 5/15/2016.
 */
public class BlogCategory {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("name")
    @Expose
    private String name;
    @Expose(deserialize = false,serialize = false)
    private String slug;
    @Expose(deserialize = false,serialize = false)
    private String taxonomy;
    @Expose(deserialize = false,serialize = false)
    private String parent;
    @Expose(deserialize = false,serialize = false)
    @SerializedName("_links")
    private LinksModel links;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<BlogCategory> removeCategory(List<BlogCategory> blogCategories, Long categoryId){

        List<BlogCategory> newBlogCategoryList = new ArrayList<>();
        for(BlogCategory blogCategory : blogCategories){
            if(!blogCategory.getId().equals(categoryId))
            newBlogCategoryList.add(blogCategory);
        }
        return newBlogCategoryList;
    }
}

package com.nbos.capi.modules.wordpress.v0.models.blog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashkumar on 5/16/2016.
 */
public class BlogFeatureImage {


    @SerializedName("thumbnail")
    @Expose
    private List<String> thumbnail = new ArrayList<>();
    @SerializedName("medium")
    @Expose
    private List<String> medium = new ArrayList<>();
    @SerializedName("medium_large")
    @Expose
    private List<String> mediumLarge = new ArrayList<>();
    @SerializedName("ios_thumbnail")
    @Expose
    private List<String> iosThumbnail = new ArrayList<>();

    /**
     *
     * @return
     * The thumbnail
     */
    public List<String> getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     * The thumbnail
     */
    public void setThumbnail(List<String> thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     *
     * @return
     * The medium
     */
    public List<String> getMedium() {
        return medium;
    }

    /**
     *
     * @param medium
     * The medium
     */
    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    /**
     *
     * @return
     * The mediumLarge
     */
    public List<String> getMediumLarge() {
        return mediumLarge;
    }

    /**
     *
     * @param mediumLarge
     * The medium_large
     */
    public void setMediumLarge(List<String> mediumLarge) {
        this.mediumLarge = mediumLarge;
    }

    /**
     *
     * @return
     * The iosThumbnail
     */
    public List<String> getIosThumbnail() {
        return iosThumbnail;
    }

    /**
     *
     * @param iosThumbnail
     * The ios_thumbnail
     */
    public void setIosThumbnail(List<String> iosThumbnail) {
        this.iosThumbnail = iosThumbnail;
    }

    public String getMeduimImgUrl(){
        return mediumLarge.get(0);
    }
    public String getThumbNailUrl(){
        return thumbnail.get(0);
    }

}

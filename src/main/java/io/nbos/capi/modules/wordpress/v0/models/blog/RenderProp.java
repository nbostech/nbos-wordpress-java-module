package io.nbos.capi.modules.wordpress.v0.models.blog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ashkumar on 5/16/2016.
 */
public class RenderProp {


    @SerializedName("rendered")
    @Expose
    private String rendered;

    /**
     *
     * @return
     * The rendered
     */
    public String getRendered() {
        return rendered;
    }

    /**
     *
     * @param rendered
     * The rendered
     */
    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

}

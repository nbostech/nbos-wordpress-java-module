package io.nbos.capi.modules.wordpress.v0;
import io.nbos.capi.modules.wordpress.v0.models.blog.BlogCategory;
import io.nbos.capi.modules.wordpress.v0.models.blog.BlogPost;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by vivekkiran on 7/29/16.
 */

public interface WPRemoteApi {
    String blogCategoriesURL="/wp-json/wp/v2/categories";
    String blogPostListURL="/wp-json/wp/v2/{lang}/posts";

    @GET(blogCategoriesURL)
    Call<List<BlogCategory>> getCategories(@Query("parent") Long parent, @Query("per_page") Long perPage);

    @GET(blogPostListURL)
    Call<List<BlogPost>> getBlogs(@Path("lang")String lang, @Query("filter[cat]") Long categoryId, @Query("page") Long page, @Query("per_page") Long perPage);

}

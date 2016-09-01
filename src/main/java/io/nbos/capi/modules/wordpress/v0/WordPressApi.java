package io.nbos.capi.modules.wordpress.v0;

import com.nbos.capi.api.v0.IdnCallback;
import com.nbos.capi.api.v0.NetworkApi;
import io.nbos.capi.modules.wordpress.v0.models.blog.BlogCategory;
import io.nbos.capi.modules.wordpress.v0.models.blog.BlogPost;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by vivekkiran on 7/29/16.
 */

public class WordPressApi extends NetworkApi{
    public WordPressApi() {
        super();
        setModuleName("wordpress");
        setRemoteApiClass(WPRemoteApi.class);
    }

    public List<BlogCategory> getCategories(Long categoryId, Long perPage,final IdnCallback<List<BlogCategory>> callback) {
        WPRemoteApi wpRemoteApi = getRemoteApi();

        Call<List<BlogCategory>> call = wpRemoteApi.getCategories(categoryId,perPage);

        List<BlogCategory> blogCategory = null;
        call.enqueue(new Callback<List<BlogCategory>>(){
            @Override
            public void onResponse(Call<List<BlogCategory>> call, Response<List<BlogCategory>> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<List<BlogCategory>> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return blogCategory;
    }
    public List<BlogPost> getPosts(String lang, Long categoryFilter, Long pageNumber, Long perPage, final IdnCallback<List<BlogPost>> callback) {
        WPRemoteApi wpRemoteApi = getRemoteApi();

        Call<List<BlogPost>> call = wpRemoteApi.getBlogs(lang,categoryFilter,pageNumber,perPage);

        List<BlogPost> blogPosts = null;
        call.enqueue(new Callback<List<BlogPost>>() {
            @Override
            public void onResponse(Call<List<BlogPost>> call, Response<List<BlogPost>> response) {
                if (response.code() == 200) {
                    callback.onResponse(response);
                } else{
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<List<BlogPost>> call, Throwable t) {
                callback.onFailure(t);
            }
        });
        return blogPosts;
    }



}

package com.example.githubapisearch.retrofit;

import com.example.githubapisearch.models.ItemsModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubRepoEndPoint {
    @GET("/search/repositories")
    Call<ItemsModel> getRepo(@Query("q") String name,@Query("sort") String forks);

}




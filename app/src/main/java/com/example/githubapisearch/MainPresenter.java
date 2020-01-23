package com.example.githubapisearch;



import com.example.githubapisearch.models.Items;
import com.example.githubapisearch.models.ItemsModel;
import com.example.githubapisearch.models.Owner;
import com.example.githubapisearch.retrofit.APIClient;
import com.example.githubapisearch.retrofit.GitHubRepoEndPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MainContract.MainPresenter {

    MainContract.MainView mainView ;



    public MainPresenter(MainContract.MainView mainView) {
        this.mainView=mainView;
    }



    //GET RESPONSE
    @Override
    public void getQuery(String query,String sort) {
        GitHubRepoEndPoint apiService =
                APIClient.getClient().create(GitHubRepoEndPoint.class);

        Call<ItemsModel> call = apiService.getRepo(query,sort);
        call.enqueue(new Callback<ItemsModel>() {
            @Override
            public void onResponse(Call<ItemsModel> call, Response<ItemsModel> response) {
                List<Items> articleList = new ArrayList<>();
                articleList.clear();
                articleList = response.body().getItems();
                mainView.setResults(articleList);

            }

            @Override
            public void onFailure(Call<ItemsModel> call, Throwable t) {
                mainView.setErrorMessage(t.getMessage().toString());

            }

        });
    }
}

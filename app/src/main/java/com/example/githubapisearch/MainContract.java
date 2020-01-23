package com.example.githubapisearch;

import com.example.githubapisearch.models.Items;

import java.util.List;

public interface MainContract {

   interface MainView {
      void  setResults(List<Items> articleList );
      void setErrorMessage(String errorMessage);

    }

    interface MainPresenter{
        void getQuery(String query,String sort);

    }

}

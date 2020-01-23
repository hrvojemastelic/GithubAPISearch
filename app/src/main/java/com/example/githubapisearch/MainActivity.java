package com.example.githubapisearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.githubapisearch.adapter.ResultsRecyclerAdapter;
import com.example.githubapisearch.models.Items;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    MainPresenter mainPresenter;
    ResultsRecyclerAdapter resultsRecyclerAdapter;
    RecyclerView recyclerView;
    SearchView searchView;
    LinearLayoutManager linearLayoutManager;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter=new MainPresenter(this);
        recyclerView=findViewById(R.id.main_recyclerview);
        radioGroup=findViewById(R.id.main_radio_group);

        searchView=findViewById(R.id.searchView);
         searchView.setFocusable(false);
         searchView.setIconified(false);
         searchView.requestFocusFromTouch();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                mainPresenter.getQuery(query, String.valueOf(radioButton.getText()));

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    @Override
    public void setResults(List<Items> articleList) {
        linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        resultsRecyclerAdapter = new ResultsRecyclerAdapter(articleList, MainActivity.this);
        recyclerView.setAdapter(resultsRecyclerAdapter);
        resultsRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        Toast.makeText(this, "Upss "+ String.valueOf(errorMessage), Toast.LENGTH_SHORT).show();
    }

    public void checkButton(View v ){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
        Toast.makeText(this, "Sort by "+ radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}

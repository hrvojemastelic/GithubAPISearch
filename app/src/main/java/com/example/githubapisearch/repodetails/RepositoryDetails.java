package com.example.githubapisearch.repodetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.githubapisearch.R;
import com.example.githubapisearch.models.Items;
import com.example.githubapisearch.models.Owner;
import com.example.githubapisearch.userdetails.UserDetails;

import java.util.ArrayList;

public class RepositoryDetails extends AppCompatActivity {

    TextView repoName,sowner,description,link,updated,date,language;
    ImageView repoImageView;
    Owner owner;
    Items items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_details);
        repoImageView=findViewById(R.id.repo_imageview);
        repoName=findViewById(R.id.repo_name);
        sowner=findViewById(R.id.repo_owner);
        description=findViewById(R.id.repo_description);
        link=findViewById(R.id.repo_link);
        updated=findViewById(R.id.repo_update);
        date=findViewById(R.id.repo_date);
        language=findViewById(R.id.repo_language);


         items = getIntent().getParcelableExtra("items");
         owner=getIntent().getParcelableExtra("owner");


        repoName.setText("Repositorie name : "+ "\n" + items.getName() );
       sowner.setText("Owner : "+ "\n" + owner.getLogin());
        description.setText("Description :"+"\n" +items.getDescription());
        link.setText("Open full repo in browser at  "+"\n" + items.getHtmlUrl());
        updated.setText("Last update : " + items.getUpdatedAt());
        date.setText("Uploaded at : " + items.getCreatedAt());
        language.setText("Language : " +"\n" + items.getLanguage());
        Glide.with(this).load(owner.getAvatarUrl()).into(repoImageView);

        //start userdetails from profile image
        repoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RepositoryDetails.this, UserDetails.class);
                intent.putExtra("owner",owner);
                startActivity(intent);

            }
        });

    }
}

package com.example.githubapisearch.userdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.githubapisearch.R;
import com.example.githubapisearch.models.Owner;

public class UserDetails extends AppCompatActivity {

    ImageView imageView;
    TextView username,type,nodeId,url,id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        imageView=findViewById(R.id.user_imageview);
        username=findViewById(R.id.user_username);
        type=findViewById(R.id.user_type);
        nodeId=findViewById(R.id.user_node_id);
        url=findViewById(R.id.user_url);
        id=findViewById(R.id.user_id);

        Owner owner=getIntent().getParcelableExtra("owner");

        //set values
        Glide.with(this).load(owner.getAvatarUrl()).into(imageView);
        username.setText("User : " + owner.getLogin());
        type.setText("Type : " +  owner.getType());
        nodeId.setText("NodeId : " +  String.valueOf(owner.getNodeId()));
        url.setText("Profile url : "  +"\n"+" https://github.com/"+owner.getLogin());
        id.setText("Id : " + owner.getId());
    }
}

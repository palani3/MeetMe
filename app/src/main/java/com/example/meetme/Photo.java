package com.example.meetme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Photo extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);


        button=(Button)findViewById(R.id.Save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();

            }
        });

        button=(Button)findViewById(R.id.Signout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signout();

            }
        });



    }

    public void signout(){
        mAuth.getInstance().signOut();

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void save()
    {
        Intent intent= new Intent(this,Maindata.class);
        startActivity(intent);
    }


}

package com.example.abhirami.rollcaller;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.loopj.android.http.JsonHttpResponseHandler;
import cz.msebera.android.httpclient.Header;
import org.json.JSONObject;
import com.voiceit.voiceit2.VoiceItAPI2;


public class MainActivity extends AppCompatActivity {


    public String username="";
    public String value="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void usernamesubmit(View view)
    {


        EditText textuser=(EditText)findViewById(R.id.username);
        username=textuser.getText().toString();
        Intent autenteintent=new Intent(MainActivity.this,Authente.class);
        autenteintent.putExtra("userid",username);
        startActivity(autenteintent);





    }


}
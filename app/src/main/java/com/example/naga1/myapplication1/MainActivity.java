package com.example.naga1.myapplication1;

import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.Toast;
import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnTouchListener;
import  android.net.http.*;
import android.net.*;
import android.content.Intent;
import android.view.*;
import android.text.Html;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.*;
import java.io.*;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.*;
import com.google.firebase.messaging.RemoteMessage;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private Button msendData;
    private String html;
    private  TextView  out1,out2,out3,out4,out5;
    int txtSize = 14;
    private static final String TAG = "MainActivity";

    private GoogleApiClient client;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button t1 = (Button) findViewById(R.id.news);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        t1.setGravity(Gravity.CENTER);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        Button t2 = (Button) findViewById(R.id.hours);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        Button t3 = (Button) findViewById(R.id.floormaps);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        Button t4 = (Button) findViewById(R.id.campusmap);
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        Button t5 = (Button) findViewById(R.id.about);
        t5.setMovementMethod(LinkMovementMethod.getInstance());
        FirebaseMessaging.getInstance().subscribeToTopic("news");
        msendData = (Button) findViewById(R.id.sendData);
        msendData.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String token = FirebaseInstanceId.getInstance().getToken();
                Log.d(TAG, "Token:" + token);
                Toast.makeText(MainActivity.this, token, Toast.LENGTH_SHORT).show();
            }
        });

        t1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               try{
                   URL url=new URL("http://libguides.lib.siu.edu/hours");
                   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                   String line;
                   while ((line=br.readLine())!=null){
                       br.close();

                   }

               }
               catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}













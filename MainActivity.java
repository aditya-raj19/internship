package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dailog = dailog.getInstance();

        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://backend-test-zypher.herokuapp.com/testData";
// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                response -> {
                    // Display the first 500 characters of the response string.
                    Log.d("myapp","the response is"+response.substring(0,100));

                     //dailog.show(MainActivity.this);
                    Intent intent=new Intent(this,MainActivity2.class);
                    startActivity(intent);

                },
                error -> Log.d("error","something went wrong"));

// Add the request to the RequestQueue.
        queue.add(stringRequest);

    }

}
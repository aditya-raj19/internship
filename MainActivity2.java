package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.github.andreilisun.swipedismissdialog.SwipeDismissDialog;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         Button btnOk;
         SwipeDismissDialog swipeDismissDialog;
         View dialog= LayoutInflater.from(getBaseContext()).inflate(R.layout.dialog,null);
         swipeDismissDialog=new SwipeDismissDialog.Builder(MainActivity2.this)
         .setView(dialog)
         .build()
         .show();
         btnOk=(Button)dialog.findViewById(R.id.btnOk);
         btnOk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String b="https://www.linkedin.com/company/myknot-services-opc-private-limited/?originalSubdomain=in";
            Uri webpag = Uri.parse(b);
            Intent inten = new Intent(Intent.ACTION_VIEW, webpag);
            if (inten.resolveActivity(getPackageManager()) != null) {
                startActivity(inten);
            }

        }
        });
    }
    }

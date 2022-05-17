package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSimpleListView;
    Button buttonAdapterListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonSimpleListView=findViewById(R.id.buttonSimpleListView);
        this.buttonAdapterListView=findViewById(R.id.buttonAdapterListView);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.buttonSimpleListView: AbreSimpleListView(); break;
                    case R.id.buttonAdapterListView: AbreAdapterListView(); break;
                }
            }
        };

        this.buttonSimpleListView.setOnClickListener(onClickListener);
        this.buttonAdapterListView.setOnClickListener(onClickListener);
    }

    public void AbreSimpleListView()
    {
        Intent i = new Intent(getApplicationContext(), SimpleListView.class);
        startActivity(i);
    }

    public void AbreAdapterListView()
    {
        Intent i = new Intent(getApplicationContext(), AdapterListView.class);
        startActivity(i);
    }
}
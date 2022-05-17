package com.example.mylistview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylistview.controller.FrutaControler;
import com.example.mylistview.model.Fruta;

import java.util.Arrays;
import java.util.List;

public class AdapterListView extends AppCompatActivity {
    FrutaControler frutaController;
    ListView listView;
    List<Fruta> listFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_list_view);

        listView=findViewById(R.id.listView);

        frutaController = new FrutaControler();
        listFrutas = Arrays.asList(frutaController.getFrutas());

        ExibeFrutaAdapter frutaAdapterListView = new ExibeFrutaAdapter(
                getApplicationContext(),
                R.layout.template_item_fruta,
                listFrutas
        );

        listView.setAdapter(frutaAdapterListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),ExibeFruta.class);
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });
    }
}

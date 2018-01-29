package com.example.ejerciciolistviewbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView nombres;
    TextView superior,inferior;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres =(ListView)findViewById(R.id.nombres);
        superior =(TextView)findViewById(R.id.textosuperior);
        inferior =(TextView)findViewById(R.id.textoinferior);

        String[] nombresprincipales = {"Paco", "Juan","Antonio", "Isa", "Elena","Alvaro","Cecilia", "Manuel", "Sara","Jose Ramon","Maria","Joaquin","Ines","Ricardo","Jacopo","Claudia"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombresprincipales);


        nombres.setAdapter(adaptador);

        nombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String clicadocorto = parent.getItemAtPosition(position).toString();
                superior.setText(clicadocorto);


            }
        });


    }
}

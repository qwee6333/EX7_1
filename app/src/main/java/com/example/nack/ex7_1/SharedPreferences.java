package com.example.nack.ex7_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Nack on 2015/4/26.
 */
public class SharedPreferences extends ActionBarActivity {
    private Spinner spinner,spinner2;
    private TextView color,size;
    private Button btsure;
    private Button btreture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shaerpreferences);
        findview();
    }
    private void findview(){
        color=(TextView)findViewById(R.id.color);
        size=(TextView)findViewById(R.id.size);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner.setSelection(0,true);
        spinner.setOnItemSelectedListener(listener);
        spinner.setSelection(1,true);
        spinner.setOnItemSelectedListener(listener);

    }
    Spinner.OnItemSelectedListener listener=new Spinner.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            parent.getItemAtPosition(position).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}


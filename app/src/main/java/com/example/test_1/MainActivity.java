package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MaterialButton materialButton =findViewById(R.id.sommeId);
        EditText editText1=findViewById(R.id.etnd1);
        EditText editText2=findViewById(R.id.etdn2);
        EditText editText3=findViewById(R.id.etnd3);
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");

      /* Avec la méthode d'auditeur d'événement
      button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setText("Bonjour tout le monde");
           }
       });
       */
    }
    public void somme(View view){
        EditText editText1=findViewById(R.id.etnd1);
        EditText editText2=findViewById(R.id.etdn2);
        EditText editText3=findViewById(R.id.etnd3);
        int st1 = Integer.parseInt(editText1.getText().toString());
        int st2 = Integer.parseInt(editText2.getText().toString());
        editText3.setText(String.valueOf(st1+st2));


    }
    public void reset(View view){
        EditText editText1=findViewById(R.id.etnd1);
        EditText editText2=findViewById(R.id.etdn2);
        EditText editText3=findViewById(R.id.etnd3);
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");


    }
}
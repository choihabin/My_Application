package com.example.rin71.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button button1;
    Button button2;
    EditText edit1;
    RadioButton rbutton1,rbutton2;
    String text1;
    ImageView imgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        edit1 =(EditText)findViewById(R.id.edit1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text1= edit1.getText().toString();

                Toast.makeText(getApplicationContext(), text1, Toast.LENGTH_SHORT).show();
            }
        });

        button2=(Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text1=edit1.getText().toString();

                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(text1));
                startActivity(mIntent);
            }
        });

        rbutton1=(RadioButton)findViewById(R.id.rbutton1);
        rbutton2=(RadioButton)findViewById(R.id.rbutton2);
        imgPet=(ImageView)findViewById(R.id.ImgPet);

        rbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgPet.setImageResource(R.drawable.dog);
            }
        });
        rbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgPet.setImageResource(R.drawable.dog2);
            }
        });
    }
}

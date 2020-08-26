package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class WorkActiviry extends AppCompatActivity {

    private ImageView cats;
    private MediaPlayer catMeow;
//    private Number eatInDay,Days;
    private CheckBox check;
    private static final double eat=20.94,filler=300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_activiry);

        cats=(ImageView)findViewById(R.id.Cat);
        catMeow=MediaPlayer.create(this,R.raw.catmeow);
        ImageClick();
    }

    public void ImageClick(){
        cats.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        catMeow.start();
                    }
                }
        );
    }

    public void Click(View view){
        EditText eatIdDay=(EditText)findViewById(R.id.editTextNumber3);
        EditText Days=(EditText)findViewById(R.id.editTextNumber4);
        TextView result=(TextView)findViewById(R.id.textView2);
        check=(CheckBox)findViewById(R.id.checkBox);
        double eatDay=Double.parseDouble(eatIdDay.getText().toString()),
                days=Double.parseDouble(Days.getText().toString()),
                Sum=0;
        if(check.isChecked()){
            Sum=eatDay*days+(int)(days/31)*filler;
        }
        else
            Sum=eatDay*days;
        result.setText(Double.toString(Sum));
        Toast.makeText(WorkActiviry.this,"Время кормить котика!",Toast.LENGTH_SHORT).show();
    }

}
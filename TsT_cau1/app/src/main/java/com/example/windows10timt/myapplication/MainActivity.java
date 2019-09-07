package com.example.windows10timt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonA;
    CheckBox checkBoxA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA=findViewById(R.id.button1);
        checkBoxA=findViewById(R.id.cbkBox);


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxA.isChecked()) {
                    Toast.makeText(MainActivity.this,"Chao mung ban dang nhap he thong, thong tin cua ban da duoc luu",
                            Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this,"Chao mung ban dang nhap he thong, thong tin cua ban khong duoc luu",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

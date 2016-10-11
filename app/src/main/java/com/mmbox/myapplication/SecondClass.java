package com.mmbox.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_class);
        Button btn_show_toast = (Button) findViewById(R.id.btn_show_toast);
        btn_show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondClass.this, "这个是修复成功的提示", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

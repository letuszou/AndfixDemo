package com.mmbox.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.File;


public class MainActivity extends AppCompatActivity {
    private String filePath = Environment.getExternalStorageDirectory() + "/plug/out.apatch";
    private Button btn_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_intent = (Button) findViewById(R.id.btn_intent);
        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File mFile = new File(filePath);
                if (!mFile.exists()) {
                    Toast.makeText(MainActivity.this,"文件不存在",Toast.LENGTH_SHORT).show();
                } else {
                    //列出文件夹中的文件、
                        PatchManager mPatchManager = new PatchManager(MainActivity.this);
                        try {
                            mPatchManager.addPatch(filePath);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    Intent intent = new Intent(MainActivity.this, SecondClass.class);
                    startActivity(intent);
            }
        });
    }
}

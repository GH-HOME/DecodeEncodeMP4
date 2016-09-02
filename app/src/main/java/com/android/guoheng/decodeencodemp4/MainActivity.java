package com.android.guoheng.decodeencodemp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EncodeDecodeSurface test=new EncodeDecodeSurface();
        try {
            test.testEncodeDecodeSurface();
        }catch (Throwable a){
            a.printStackTrace();
        }

    }
}

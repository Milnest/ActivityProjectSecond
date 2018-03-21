package com.milnest.activityprojectsecond;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultField = (TextView)findViewById(R.id.resultField);
        if(getIntent() != null) {
            resultField.setText(getIntent().getData().toString());
        }
    }
}

package com.curve.nandhakishore.spiderone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle intentData = getIntent().getExtras();
        TextView displayBox = (TextView) findViewById(R.id.text_display);
        displayBox.setText(intentData.get("KEY1").toString());
    }
}

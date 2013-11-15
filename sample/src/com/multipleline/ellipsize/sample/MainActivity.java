package com.multipleline.ellipsize.sample;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.Menu;
import android.widget.TextView;

import com.example.testtest.R;
import com.multipleline.ellipsize.EllipsizingTextView;

public class MainActivity extends Activity {

    final static String TEXT = "This thing of darkness I acknowledge mine. --From The Tempest (V, i, 275-276) Though this be madness, yet there is method in 't. --From Hamlet (II, ii, 206) What's in a name? That which we call a rose By any other word would smell as sweet. --From Romeo and Juliet (II, ii, 1-2)";
    TextView tvFull, tvNone, tvStart, tvMiddle, tvEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFull = (EllipsizingTextView) findViewById(R.id.textViewFull);
        tvNone = (EllipsizingTextView) findViewById(R.id.textViewNone);
        tvStart = (EllipsizingTextView) findViewById(R.id.textViewStart);
        tvMiddle = (EllipsizingTextView) findViewById(R.id.textViewMiddle);
        tvEnd = (EllipsizingTextView) findViewById(R.id.textViewEnd);
        tvFull.setText(TEXT);
        tvNone.setText(TEXT);
        tvStart.setText(TEXT);
        tvMiddle.setText(TEXT);
        tvEnd.setText(TEXT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

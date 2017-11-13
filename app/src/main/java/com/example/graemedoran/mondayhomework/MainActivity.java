package com.example.graemedoran.mondayhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private EditText question;
    private Button countWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = (TextView) findViewById(R.id.Counter);
        this.question = (EditText) findViewById(R.id.Question);
        this.countWords = (Button) findViewById(R.id.button);
    }



    public void onButtonClicked(View button) {
        String text = this.question.getText().toString();
        Sentence sentence = new Sentence();
        this.counter.setText(Integer.toString(sentence.Count(text)));


    }
}

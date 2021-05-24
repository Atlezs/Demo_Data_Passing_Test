package sg.edu.rp.c346.id2006248.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer2 = findViewById(R.id.textView2);

        Intent intentReceived2 = getIntent();
        char chara = intentReceived2.getCharExtra("char",'a');
        tvAnswer2.setText("Character value received is: " + chara);
    }
}
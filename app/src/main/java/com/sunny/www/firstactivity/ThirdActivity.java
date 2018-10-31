package com.sunny.www.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView)findViewById(R.id.textView4);
        textView.setText(bundle.getString("value02"));

        Button button = findViewById(R.id.button03);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextvalue03=findViewById(R.id.editTextvalue03);
        String editTextvalue03String=editTextvalue03.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("value03",editTextvalue03String);
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}

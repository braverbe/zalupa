package com.example.practise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username_field;
    private EditText userage_field;
    private RadioGroup usergender_fields;
    private Button send_data_button;
    private Button reset_data_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_field = findViewById(R.id.editTextPersonName);
        userage_field = findViewById(R.id.editPersonAge);
        usergender_fields = findViewById(R.id.gender_radio_group);
        send_data_button = findViewById(R.id.button_send);
        reset_data_button = findViewById(R.id.button_reset);

        send_data_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username_field.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this, "Name cannot be empty", Toast.LENGTH_SHORT).show();
                if(usergender_fields.getCheckedRadioButtonId()==-1)
                    Toast.makeText(MainActivity.this, "Gender cannot be empty", Toast.LENGTH_SHORT).show();
                if(userage_field.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this, "Age cannot be empty", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
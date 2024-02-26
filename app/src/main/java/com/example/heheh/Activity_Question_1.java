package com.example.heheh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_Question_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        RadioGroup answerq1 = findViewById(R.id.answers1);
        Button answer = findViewById(R.id.ans1);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Activity_Question_1.this,"Hello" + receivedData,
                Toast.LENGTH_SHORT).show();

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonid = answerq1.getCheckedRadioButtonId();
                if (selectedRadioButtonid != -1) {
                    RadioButton selectedRb = findViewById(selectedRadioButtonid);
                    if(Integer.parseInt(selectedRb.getText().toString()) == 6){
                        Toast.makeText(Activity_Question_1.this, "Right Answer",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Activity_Question_1.this,
                                Activity_Question_2.class);
                        intent.putExtra("Name", "Anthony");
                        startActivity(intent);
                        }else{
                            Toast.makeText(Activity_Question_1.this,"Wrong answer",
                                    Toast.LENGTH_SHORT).show();
                        }
                            Toast.makeText(Activity_Question_1.this,"Selected"
                                    + selectedRb.getText(), Toast.LENGTH_SHORT).show();

                    }else {
                    Toast.makeText(Activity_Question_1.this,"No option Selected",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
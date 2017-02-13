package com.example.lenovo.timetrackerproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTimeActivity extends AppCompatActivity {
    private Button buttonCancel;

    private Button buttonsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_time);
        buttonCancel=(Button)findViewById(R.id.cancel_button);
        buttonsave=(Button)findViewById(R.id.save_button) ;
        buttonCancel.setOnClickListener(new CancelButtonListener());
        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                EditText timeView = (EditText)findViewById(R.id.time_view);
                intent.putExtra("time",timeView.getText().toString());
                EditText notesView = (EditText)findViewById(R.id.notes_view);
                intent.putExtra("notes", notesView.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }
    class CancelButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            finish();

        }
    }

}

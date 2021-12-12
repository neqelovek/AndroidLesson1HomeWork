package ru.gb.androidlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer argument1;
    private Integer argument2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView1 = findViewById(R.id.textView_for_equals);
        final EditText editText1 = findViewById(R.id.editText_equal1);
        final EditText editText2 = findViewById(R.id.editText_equal2);
        Button button = findViewById(R.id.button_for_equals);

        button.setOnClickListener(v -> {
            try {
            argument1 = Integer.valueOf(editText1.getText().toString());
            argument2 = Integer.valueOf(editText2.getText().toString());

                if (argument1.equals(argument2)){
                    textView1.setText("Равно!");
                }else {
                    textView1.setText("Не равно!");
                }
            } catch (Exception e) {
                textView1.setText("Введие число!");
            }
        });


    }
}
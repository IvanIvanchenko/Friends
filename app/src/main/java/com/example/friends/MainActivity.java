package com.example.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onClick2 (View view)
    {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
    }
    public void onClick3 (View view)
    {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.textView4);
        // Получаем, отмечен ли данный флажок
        if(checkBox.isChecked()) {
            selection.setText("Вкл");
            checkBox.setText("Выкл");
        }
        else {
            selection.setText("Выкл");
            checkBox.setText("Вкл");
        }
    }

    public void onToggleButtonClicked(View view) {

        // включена ли кнопка
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // действия если включена
            Toast.makeText(this, "Включен", Toast.LENGTH_LONG).show();
        } else {
            // действия, если выключена
            Toast.makeText(this, "Выключен", Toast.LENGTH_LONG).show();
        }
    }
}

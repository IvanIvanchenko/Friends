package com.example.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onClickWebView(View view)
    {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }
    public void onClickMain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
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

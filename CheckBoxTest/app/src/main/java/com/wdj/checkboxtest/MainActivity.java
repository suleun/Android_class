package com.wdj.checkboxtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.checkbox_meat:
                if (checked)
                    Toast.makeText(getApplicationContext(),"고기선택",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"고기선택 해제",Toast.LENGTH_SHORT).show();

             break;

            case R.id.checkbox_cheese:
                if (checked)
                    Toast.makeText(getApplicationContext(),"치즈선택",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"치즈선택 해제",Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
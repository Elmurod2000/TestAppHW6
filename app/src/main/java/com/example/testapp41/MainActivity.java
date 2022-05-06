package com.example.testapp41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.testapp41.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupUI();
    }

    private void setupUI() {
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String num1 = binding.num1Ed.getText().toString();
                String num2 = binding.num2Ed.getText().toString();
                String result = math.add(num1, num2);
                binding.resultTv.setText(result);
            }
        });

        binding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String num1 = binding.num1Ed.getText().toString();
                String num2 = binding.num2Ed.getText().toString();
                String result = math.divide(num1, num2);
                binding.resultTv.setText(result);
            }
        });
    }
}
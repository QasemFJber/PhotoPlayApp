package com.example.photoplayapp.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.photoplayapp.R;
import com.example.photoplayapp.databinding.ActivityForgetPasswordBinding;

public class ForgetPassword extends AppCompatActivity implements View.OnClickListener {
    ActivityForgetPasswordBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setOnClick();
    }

    private void setOnClick() {
        binding.tvBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_back){
            Intent intent = new Intent(getApplicationContext(),Login.class);
            startActivity(intent);
        }

    }
}
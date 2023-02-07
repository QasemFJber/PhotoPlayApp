package com.example.photoplayapp.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.photoplayapp.R;
import com.example.photoplayapp.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity implements View.OnClickListener {
    ActivityLoginBinding binding;
    public static final String CHANNEL_ID  = "Qas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setOnClick();
    }

    private void setOnClick() {
        binding.tvRegester.setOnClickListener(this::onClick);
        binding.btnLogin.setOnClickListener(this);
        binding.tvForgotpassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_regester){
            Intent intent = new Intent(getApplicationContext(),Register.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_login){
            Intent intent = new Intent(getApplicationContext(),Home.class);
            startActivity(intent);
        }else if (v.getId() == R.id.tv_forgotpassword){
            Intent intent = new Intent(getApplicationContext(),ForgetPassword.class);
            startActivity(intent);
        }
    }
    private void notifications(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,"Qasem", NotificationManager.IMPORTANCE_HIGH);
//            NotificationManager manager = getSystemService(no)
//            NotificationCompat notificationCompat =
        }
    }
}
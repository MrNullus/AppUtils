package etec.com.gustavo.henrique.apputils;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import etec.com.gustavo.henrique.apputils.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // seta o binding com um layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // pega o layout raiz
        setContentView(binding.getRoot());
    }
}
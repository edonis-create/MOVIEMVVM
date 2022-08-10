package com.oxcoding.moviemvvm.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.oxcoding.moviemvvm.R
import com.oxcoding.moviemvvm.ui.popular_movie.MainActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash);

        supportActionBar?.hide();

        Handler().postDelayed({
            val intent = Intent(this@Splash,MainActivity::class.java);
            startActivity(intent);
            finish();
        },3000)
    }
}
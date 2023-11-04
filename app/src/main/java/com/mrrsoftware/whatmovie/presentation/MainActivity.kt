package com.mrrsoftware.whatmovie.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mrrsoftware.whatmovie.R
import com.mrrsoftware.whatmovie.presentation.domain.SimpleMovie

class MainActivity : AppCompatActivity() {

    /*private val binding by lazy {
        MainActivityBinding
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun searchMovie(userComment: String) {
    }

    fun showMovies() {
    }

    fun goToMovie(simpleMovie: SimpleMovie) {
    }
}

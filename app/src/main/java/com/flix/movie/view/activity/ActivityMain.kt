
package com.flix.movie.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flix.movie.databinding.ActivityMainBinding
class ActivityMain : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
    }
}

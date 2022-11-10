package com.example.daggert.act1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggert.act2.MainActivity2
import com.example.daggert.MainApplication.Companion.appComponent
import com.example.daggert.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {



    @Inject
    lateinit var viewModel: MainViewModel

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
//        (application as MainApplication).app
        appComponent.componentActivityBuilder().componentActivity(this).build().inject(this)
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.abc.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}
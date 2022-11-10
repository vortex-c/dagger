package com.example.daggert.act2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggert.MainApplication.Companion.appComponent
import com.example.daggert.R
import com.example.daggert.act1.MainViewModel
import com.example.daggert.databinding.ActivityMain2Binding
import javax.inject.Inject



class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel2

    private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.componentActivityBuilder().componentActivity(this).build().inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.getUser()
    }
}
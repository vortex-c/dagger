package com.example.daggert.act2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.daggert.MainApplication
import com.example.daggert.R
import com.example.daggert.act1.MainViewModel
import com.example.daggert.databinding.ActivityMain2Binding
import javax.inject.Inject



class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<MainViewModel2> { viewModelFactory }

    private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).appComponent.addAct2Component().create().inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.getUser()
    }
}
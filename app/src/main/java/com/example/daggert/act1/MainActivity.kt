package com.example.daggert.act1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggert.MainApplication
import com.example.daggert.act2.MainActivity2
import com.example.daggert.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {



    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<MainViewModel> { viewModelFactory }
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).appComponent.addAct1Component().create().inject(this)
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.abc.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}
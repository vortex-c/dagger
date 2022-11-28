package com.example.daggert.act1.di

import androidx.lifecycle.ViewModel
import com.example.daggert.act1.MainViewModel
import com.example.daggert.act2.MainViewModel2
import com.example.daggert.di.scope.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModel2Module {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel2::class)
    abstract fun bindViewModel(viewModel: MainViewModel2):ViewModel
}
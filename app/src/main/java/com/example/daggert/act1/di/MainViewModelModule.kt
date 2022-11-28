package com.example.daggert.act1.di

import androidx.lifecycle.ViewModel
import com.example.daggert.act1.MainViewModel
import com.example.daggert.di.scope.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindViewModel(viewModel: MainViewModel):ViewModel
}
package com.example.daggert.di.modules

import com.example.daggert.MyViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelBuilder {
    @Binds
    abstract fun provideViewModelFactory(
        factory:MyViewModelFactory
    ):androidx.lifecycle.ViewModelProvider.Factory
}
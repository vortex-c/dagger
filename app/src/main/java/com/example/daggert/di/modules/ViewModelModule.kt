package com.example.daggert.di.modules

import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.daggert.act1.MainRepository
import com.example.daggert.act1.MainViewModel
import com.example.daggert.act1.MainViewModelFactory
import com.example.daggert.act2.MainRepository2
import com.example.daggert.act2.MainViewModel2
import com.example.daggert.act2.MainViewModel2Factory
import com.example.daggert.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {

    @Provides
    @ActivityScope
    fun provideMainViewModel(
        activity: ComponentActivity,
        repository: MainRepository
    ): MainViewModel {
        return ViewModelProvider(
            activity, MainViewModelFactory(repository)
        )[MainViewModel::class.java]
    }

    @Provides
    @ActivityScope
    fun provideMainViewModel2(
        activity: ComponentActivity,
        repository2: MainRepository2
    ): MainViewModel2 {
        return ViewModelProvider(
            activity, MainViewModel2Factory(repository2)
        )[MainViewModel2::class.java]
    }
}
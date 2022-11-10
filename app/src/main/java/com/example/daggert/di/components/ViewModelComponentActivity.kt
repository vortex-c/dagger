package com.example.daggert.di.components

import androidx.activity.ComponentActivity
import com.example.daggert.act1.MainActivity
import com.example.daggert.act2.MainActivity2
import com.example.daggert.di.modules.ViewModelModule
import com.example.daggert.di.scope.ActivityScope
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ViewModelModule::class])
interface ViewModelComponentActivity {

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance
        fun componentActivity(activity: ComponentActivity): Builder
        fun build(): ViewModelComponentActivity
    }
    fun inject(activity: MainActivity2)
    fun inject(activity: MainActivity)
}
package com.okynk.archproject.core.injection

import com.okynk.archproject.feature.screen.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}
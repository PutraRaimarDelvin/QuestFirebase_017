package com.example.firebase

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebase.ui.home.viewmodel.HomeViewModel
import com.example.firebase.ui.home.viewmodel.InsertViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(MahasiswaApplications().container.repositoryMhs)
        }
        initializer {
            InsertViewModel(MahasiswaApplications().container.repositoryMhs)
        }
    }

}


fun CreationExtras.MahasiswaApplications(): MahasiswaApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApp)
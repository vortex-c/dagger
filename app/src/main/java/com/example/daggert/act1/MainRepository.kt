package com.example.daggert.act1

import javax.inject.Inject

class MainRepository @Inject constructor() {
    var data = listOf(1,2,4)
}
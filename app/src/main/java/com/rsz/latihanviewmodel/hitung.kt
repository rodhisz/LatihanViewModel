package com.rsz.latihanviewmodel

import androidx.lifecycle.ViewModel

class hitung : ViewModel (){
    var result = 0

    fun calculate(width: String, height: String, length: String) {
        result = width.toInt() * height.toInt() * length.toInt()
    }
}
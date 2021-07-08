package com.example.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()

private lateinit var binding : ActivityMainBinding
private var aPerson: Person = Person("ali", "123456", "ali@gmail.com", "123,asv")

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    binding.personData = aPerson

    binding.btnUpdate.setOnClickListener() {
        aPerson.email = "xxx@gmail.com"
        aPerson.address = "123,Jalan xyz"
        binding.apply { invalidateAll() }
    }
}

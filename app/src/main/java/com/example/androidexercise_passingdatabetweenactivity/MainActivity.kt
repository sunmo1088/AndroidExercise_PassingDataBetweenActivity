package com.example.androidexercise_passingdatabetweenactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidexercise_passingdatabetweenactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener {
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val country = binding.etCountry.text.toString()

            val person = Person(name, age, country)

            Intent(this, SecondActivity::class.java).also {
//                it.putExtra("EXTRA_NAME", name)
//                it.putExtra("EXTRA_AGE", age)
//                it.putExtra("EXTRA_COUNTRY", country)

                it.putExtra("EXTRA_PERSON", person)

                startActivity(it)
            }
        }

    }
}
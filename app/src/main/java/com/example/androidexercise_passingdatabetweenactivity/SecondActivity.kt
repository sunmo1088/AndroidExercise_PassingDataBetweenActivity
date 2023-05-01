package com.example.androidexercise_passingdatabetweenactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidexercise_passingdatabetweenactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE", 0)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")
//        val personString = "$name is $age years old and lives in $country"
//        binding.tvPerson.text = personString

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        binding.tvPerson.text = person.toString()




    }
}